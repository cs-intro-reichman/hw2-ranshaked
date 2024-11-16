public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd =  Integer.parseInt(args[1]);
        int totaMinutes = (hours * 60) + minutes + minutesToAdd;
        int Totalhours = totaMinutes/60;
        int NewHours = Totalhours % 24;
        int Newminutes = totaMinutes - (Totalhours * 60);
        if(NewHours<10)
        {
            if(Newminutes < 10 )
        {
            System.out.println("0" + NewHours + ":0" + Newminutes); 
        }else
        {
        System.out.println("0" + NewHours + ":" + Newminutes);
        }
        }else{
        if(Newminutes < 10 )
        {
            System.out.println(NewHours + ":0" + Newminutes); 
        }else
        {
        System.out.println(NewHours + ":" + Newminutes);
        }
    }
    }
}
