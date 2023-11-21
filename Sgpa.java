package SGPA;

import java.util.Scanner;

public class Sgpa {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("*** Enter the following Subjects Marks details below  for 100 ***");
        System.out.print("Mathematics-II forCSE Stream (BMATS201) credit - 4 => ");
        int math = input.nextInt();
        System.out.print("Applied Chemistry for CSE Stream (BCHES202) credit - 4 => ");
        int chem = input.nextInt();
        System.out.print("Computer-Aided Engineering Drawing (BCEDK203) credit - 3 => ");
        int  cad = input.nextInt();
        System.out.print(" Engineering Science Course-II ( BESCK204x) credit - 3 => ");
        int mech = input.nextInt();
        System.out.print(" Programming Language Course-II (BETCK205x) credit - 3 =>");
        int web = input.nextInt();
        System.out.print("Professional Writing Skills in English (BPWSK206) credit -1");
        int eng = input.nextInt();
        System.out.print("Indian Constitution (BICOK207) credit - 1 =>");
        int ic = input.nextInt();
        System.out.print("Scientific Foundations of Health (BSFHK258 ) credit -1 =>");
        int sfh = input.nextInt();
        // for maths
        int  mathmark = 0;

        if(math>=90 && math<=100){
              mathmark = 10*4;
        }else if(math <90 && math>=80){
             mathmark =9*4;
        }else if(math <80 && math>=70){
             mathmark =8*4;
        }else if(math <70 && math>=60){
             mathmark =7*4;
        }else if(math <60 && math>=50){
             mathmark =6*4;
        }else if(math <50 && math>=45){
             mathmark =5*4;
        }else if(math <45 && math>=40){
             mathmark =4*4;
        }else {
             mathmark =0;
        }

        System.out.println(mathmark);
        // for chem
        int  chemMarks = 0;

        if(chem>=90 && chem<=100){
              chemMarks = 10*4;
        }else if(chem <90 && chem>=80){
             chemMarks =9*4;
        }else if(chem <80 && chem>=70){
             chemMarks =8*4;
        }else if(chem <70 && chem>=60){
             chemMarks =7*4;
        }else if(chem <60 && chem>=50){
             chemMarks =6*4;
        }else if(chem <50 && chem>=45){
             chemMarks =5*4;
        }else if(chem <45 && chem>=40){
             chemMarks =4*4;
        }else {
             chemMarks =0;
        }
        System.out.println(chemMarks);
        // for cad
        int  cadMarks = 0;

        if(cad>=90 && cad<=100){
              cadMarks = 10*3;
        }else if(cad <90 && cad>=80){
             cadMarks =9*3;
        }else if(cad <80 && cad>=70){
             cadMarks =8*3;
        }else if(cad <70 && cad>=60){
             cadMarks =7*3;
        }else if(cad <60 && cad>=50){
             cadMarks =6*3;
        }else if(cad <50 && cad>=45){
             cadMarks =5*3;
        }else if(cad <45 && cad>=40){
             cadMarks =4*3;
        }else {
             cadMarks =0;
        }
        System.out.println(cadMarks);
        // for mech
        int  mechMarks = 0;

        if(mech>=90 && mech<=100){
              mechMarks = 10*3;
        }else if(mech <90 && mech>=80){
             mechMarks =9*3;
        }else if(mech <80 && mech>=70){
             mechMarks =8*3;
        }else if(mech <70 && mech>=60){
             mechMarks =7*3;
        }else if(mech <60 && mech>=50){
             mechMarks =6*3;
        }else if(mech <50 && mech>=45){
             mechMarks =5*3;
        }else if(mech <45 && mech>=40){
             mechMarks =4*3;
        }else {
             mechMarks =0;
        }
        System.out.println(mechMarks);
        // for web
        int  webMarks = 0;

        if(web>=90 && web<=100){
              webMarks = 10*3;
        }else if(web <90 && web>=80){
             webMarks =9*3;
        }else if(web <80 && web>=70){
             webMarks =8*3;
        }else if(web <70 && web>=60){
             webMarks =7*3;
        }else if(web <60 && web>=50){
             webMarks =6*3;
        }else if(web <50 && web>=45){
             webMarks =5*3;
        }else if(web <45 && web>=40){
             webMarks =4*3;
        }else {
             webMarks =0;
        }
        System.out.println(webMarks);
        // for eng
        int  engMarks = 0;

        if(eng>=90 && eng<=100){
              engMarks = 10*1;
        }else if(eng <90 && eng>=80){
             engMarks =9*1;
        }else if(eng <80 && eng>=70){
             engMarks =8*1;
        }else if(eng <70 && eng>=60){
             engMarks =7*1;
        }else if(eng <60 && eng>=50){
             engMarks =6*1;
        }else if(eng <50 && eng>=45){
             engMarks =5*1;
        }else if(eng <45 && eng>=40){
             engMarks =4*1;
        }else {
             engMarks =0;
        }
        System.out.println(engMarks);
        // for ic
        int  icMarks = 0;

        if(ic>=90 && ic<=100){
              icMarks = 10*1;
        }else if(ic <90 && ic>=80){
             icMarks =9*1;
        }else if(ic <80 && ic>=70){
             icMarks =8*1;
        }else if(ic <70 && ic>=60){
             icMarks =7*1;
        }else if(ic <60 && ic>=50){
             icMarks =6*1;
        }else if(ic <50 && ic>=45){
             icMarks =5*1;
        }else if(ic <45 && ic>=40){
             icMarks =4*1;
        }else {
             icMarks =0;
        }
        System.out.println(icMarks);
        // for sfh
        int  sfhMarks = 0;

        if(sfh>=90 && sfh<=100){
              sfhMarks = 10*1;
        }else if(sfh <90 && sfh>=80){
             sfhMarks =9*1;
        }else if(sfh <80 && sfh>=70){
             sfhMarks =8*1;
        }else if(sfh <70 && sfh>=60){
             sfhMarks =7*1;
        }else if(sfh <60 && sfh>=50){
             sfhMarks =6*1;
        }else if(sfh <50 && sfh>=45){
             sfhMarks =5*1;
        }else if(sfh <45 && sfh>=40){
             sfhMarks =4*1;
        }else {
             sfhMarks =0;
        }
        System.out.println(sfhMarks);
        int tCredit = 20;
        int mark = mathmark + chemMarks + cadMarks + webMarks + mechMarks + icMarks + engMarks + sfhMarks;
        System.out.println(mark);

        float result = (float)(mark)/tCredit;
        System.out.println("Your sgpa =>"+ result);

        
    }

}

    
