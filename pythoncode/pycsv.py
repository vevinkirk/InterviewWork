import csv

curent1 = ""
curent2= ""
old1 = ""
old2 = ""

with open('httpd.csv') as csvfile:
    readCSV = csv.reader(csvfile, delimiter=',')
    for row in readCSV:
        curent1 = row[3]
	if old1 == curent1 :
            curent2 = row[3]
            if old2 == curent2 :
                print row[3]
            old2 = row[3]
	old1 = row[3]
