class HourMinutes{
int hours;
int minutes;
HourMinutes(int hours,int minutes){
this.hours = hours;
this.minutes = minutes;
}
HourMinutes plus(HourMinutes other){
if((this.minutes + other.minutes) > 60){
    return new HourMinutes((this.hours + other.hours)%12 , (this.minutes + other.minutes)%60);
}
else{
return new HourMinutes((this.hours + other.hours )%13 +1,(this.minutes+other.minutes)%60);
}
}
}
HourMinutes minus(HourMinutes other){
    return new HourMinutes((this.hours - other.hours) , (this.minutes - other.minutes));
}

HourMinutes h1 = new HourMinutes(5,25);
HourMinutes h2 = new HourMinutes(7,20);
//HourMinutes h3 = h1 + h2;
HourMinutes h4 = h1 - h2;
println h4.hours + ":" + (h4.minutes);

