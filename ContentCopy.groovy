//new File("/home/rxlogix/Desktop/hello.txt").eachLine{line->
//println line}
File f = new File("/home/rxlogix/Desktop/hello.txt");
File dest = new File("/home/rxlogix/Desktop/Example.txt");
dest << f.text;
new File("/home/rxlogix/Desktop/Example.txt").eachLine{line->
println line}