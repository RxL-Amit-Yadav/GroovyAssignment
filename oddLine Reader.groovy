//new File("/home/rxlogix/Desktop/hello.txt").eachLine{line->
//println line}
File f = new File("/home/rxlogix/Desktop/hello.txt");
FileReader fr = new FileReader(f);
BufferedReader br = new BufferedReader(fr);
int linnum = 0;
println br.readLine();
while(br.readLine()!=null){
println br.readLine();
}
//File dest = new File("/home/rxlogix/Desktop/Example.txt");
//dest << f.text;
//new File("/home/rxlogix/Desktop/Example.txt").eachLine{line->
//println line}