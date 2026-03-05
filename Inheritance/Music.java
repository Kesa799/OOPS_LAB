class Content{
int duration; String artist_name;
public void setdur(int d){
duration=d;
}
public void setart(String name){
artist_name=name;
}
public String getart(){
return artist_name;
}
public int getdur(){
return duration;
}
}
class Song extends Content{
String genre;
public void setgen(String gen){
genre=gen;
}
public String getgen(){
return genre;
}
}
class Podcast extends Content{
int epno;
public void setepno(int no){
epno=no;
}
public int getepno(){
return epno;
}
}
class AudioBook extends Content{
int count;
public void setcount(int c){
count=c;
}
public int getcount(){
return count;
}
}

public class Music{
public static void main(String args[]){
Song s = new Song();
Podcast p = new Podcast();
AudioBook a = new AudioBook();

s.setdur(6);
s.setart("Anirudh");
s.setgen("Romantic");
System.out.println("Duration:"+s.getdur());
System.out.println("Artist:"+s.getart());
System.out.println("Genre:"+s.getgen());

p.setdur(6);
p.setart("Anirudh");
p.setepno(12);
System.out.println();
System.out.println("Duration:"+p.getdur());
System.out.println("Artist:"+p.getart());
System.out.println("Episode:"+p.getepno());

a.setdur(6);
a.setart("Anirudh");
a.setcount(10);
System.out.println();
System.out.println("Duration:"+a.getdur());
System.out.println("Artist:"+a.getart());
System.out.println("COUNT:"+a.getcount());
}
}


