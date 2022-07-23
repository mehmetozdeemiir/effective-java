package com.example.Item28And29GenericTypes;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ListManager<Integer> studentNo = new ListManager<>();
        studentNo.addList(1701062060);
        studentNo.addList(203006014);
        studentNo.addList(203006034);

        ListManager<String> studentName = new ListManager<>();
        studentName.addList("Mehmet");
        studentName.addList("İrem");
        studentName.addList("Sedef");
        ArrayList<Integer> schoolNo =  studentNo.getList();
        ArrayList<String> studentInfo = studentName.getList();
        for(int i=0;i<studentInfo.size();i++){
            System.out.println("----------------\n< "+(i+1)+". Öğrenci Bilgisi >\n----------------\n-> Öğrenci Numarası: "+schoolNo.get(i)+"\n-> Öğrenci İsmi: "+studentInfo.get(i));
        }
        System.out.println("----------------");
    }
}
