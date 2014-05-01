import csv,glob,os,sys

csv_list =  glob.glob("oib*/*/target/site/jacoco/jacoco.csv")
aggfile = open("AggCov.csv", 'w')
covfile = open("AggCovReport.txt", 'w')
aggfile.write("GROUP,PACKAGE,CLASS,INSTRUCTION_MISSED,INSTRUCTION_COVERED,BRANCH_MISSED,BRANCH_COVERED,LINE_MISSED,LINE_COVERED,COMPLEXITY_MISSED,COMPLEXITY_COVERED,METHOD_MISSED,METHOD_COVERED\r\n")
aggfile.close()
aggfile = open("AggCov.csv", 'a')
for file in csv_list:
  tmpfile = open(file,"r")
  header = tmpfile.readline()
  aggfile.write(tmpfile.read())
  tmpfile.close()

# Total CSV has been generated, now find each line covered value and calculate average

with open("AggCov.csv", 'rb') as csvfile:
  count=0
  classsum=0
  reader=csv.DictReader(csvfile)
  for fields in reader:
    if fields['LINE_COVERED']:
      covfile.write("CLASS: "+ fields['PACKAGE']+"." + fields['CLASS']+" Coverage %: "+ fields['LINE_COVERED']+"\r\n")
      count+=1
      classsum += float(fields['LINE_COVERED'])
  covfile.write( "Total Percentage: "+ str(float(classsum)/float(count)))
  csvfile.close()
covfile.close()
