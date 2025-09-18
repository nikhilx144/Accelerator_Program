'''Problem 1 – Multi-Server Health Aggregator
Problem Statement:
You joined as a DevOps Intern at a mid-sized company. Your task is to help the Operations team by automating a health check report of all their servers.
They want to input the number of servers, and for each server:
•	Server name
•	CPU usage (%)
•	Memory usage (%)
•	Disk usage (%)
Write a Python program that:
•	Checks if any metric exceeds thresholds (CPU > 85%, Memory > 80%, Disk > 90%).
•	Prints warnings for unhealthy servers.
•	Displays the total count of unhealthy servers.

Sample input and output:
Enter the number of servers: 3
Enter details for server 1:
Server name: web
CPU usage (%): 65
Memory usage (%): 86
Disk usage (%): 75
Enter details for server 2:
Server name: cache
CPU usage (%): 86
Memory usage (%): 75
Disk usage (%): 50
Enter details for server 3:
Server name: jail
CPU usage (%): 92
Memory usage (%): 81
Disk usage (%): 76
Server web is unhealthy: Memory high
Server cache is unhealthy: CPU high
Server jail is unhealthy: CPU high, Memory high
Total unhealthy servers: 3'''
# Write your code here

details = dict()

CPU_HIGH = 85
MEM_HIGH = 80
DISK_HIGH = 90

unhealthy_servers = 0

results= []

n = int(input("Enter the number of servers: "))
for i in range(n):
    print(f"Enter the details for server {i + 1}:")
    server_name = input("Server name: ")
    cpu_usage = int(input("CPU usage (%): "))
    memory_usage = int(input("Memory usage (%): "))
    disk_usage = int(input("Disk usage (%): "))
    
    issues = []

    if cpu_usage > CPU_HIGH:
        issues.append("CPU High")
    if memory_usage > MEM_HIGH:
        issues.append("Memory High")
    if disk_usage > DISK_HIGH:
        issues.append("Disk High")
    if issues:
        unhealthy_servers += 1 
        results.append(f"Server {server_name} is unhealthy: {', '.join(issues)}")

for result in results:
    print(result)
print(f"Total unhealthy servers: {unhealthy_servers}")



''' Problem 2 – Log File Analyzer
 Problem Statement:
During your internship, you’re asked to analyze the system logs.
The system admin will input a number of log entries manually in the format:
2025-09-13 10:15:00 INFO System started
Write a Python program that:
•	Accepts a number of log lines from the user.
•	Counts the number of INFO, WARNING, and ERROR logs.
•	Displays the most frequent log level.

Sample input and output:
Enter number of log entries: 3
Enter log entry 1 (e.g., '2025-09-13 10:15:00 INFO System started'): 2025-09-14 11:50:25 WARNING high memory usage
Enter log entry 2 (e.g., '2025-09-13 10:15:00 INFO System started'): 2025-09-14 10:35:30 INFO system stopped
Enter log entry 3 (e.g., '2025-09-13 10:15:00 INFO System started'): 2025-09-14 09:36:25 INFO User login
WARNING: 1
INFO: 2
Most frequent log level: INFO'''

from collections import Counter
# Write your code here

n = int(input("Enter number of log entries: "))

war = 0
info = 0

for i in range(n):
    entry = input(f"Enter log entry {i + 1} (e.g., '2025-09-13 10:15:00 INFO System started'): ")
    parts = entry.split()
    # print(parts)
    if len(parts) >= 3:
        level = parts[2].upper()
        # print(level)
        if level == "WARNING":
            war += 1
        elif level == "INFO":
            info += 1

print(f"WARNING: {war}")
print(f"INFO: {info}")

most_freq = ""
if war > info:
    most_freq = "WARNING"
else:
    most_freq = "INFO"
print(f"Most frequet log level: {most_freq}")


'''Automated Log Cleanup
Problem Statement:
You’re developing an automated cleanup utility for logs.
The user will enter the number of log files manually, along with file names that have timestamps embedded.
Files older than 6 months should be marked for deletion.
Write a Python program that:
•	Processes user-entered file names.
•	Prints which files would be deleted and which will be kept.

Sample input and output:
Enter number of log files: 3
Enter file name 1 (format: 'app_log_YYYYMMDD.log'): app_log_20250912.log
Enter file name 2 (format: 'app_log_YYYYMMDD.log'): app_log_20231203.log
Enter file name 3 (format: 'app_log_YYYYMMDD.log'): app_log_20241205.log
Deleted files: ['app_log_20231203.log', 'app_log_20241205.log']
Remaining files: ['app_log_20250912.log']

from datetime import datetime, timedelta'''
# write your code here
from datetime import datetime, timedelta
today = datetime.today()
cutoff_date = today - timedelta(days=6*30)

n = int(input("Enter number of log files: "))

deleted_files = []
remaining_files = []

for i in range(n):
    filename = input(f"Enter file name {i + 1} (format: 'app_log_YYYYMMDD.log'): ")
    
    try:
        date_str = filename.split("_")[-1].replace(".log", "")
        file_date = datetime.strptime(date_str, "%Y%m%d")
        
        if file_date < cutoff_date:
            deleted_files.append(filename)
        else:
            remaining_files.append(filename)
    except Exception:
        print(f"Invalid filename format:{filename}")
        remaining_files.append(filename)

print(f"Deleted files: {deleted_files}")
print(f"Remaining files: {remaining_files}")