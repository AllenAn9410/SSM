package tools;

import java.util.*;

import static org.springframework.util.ObjectUtils.isEmpty;

public class ExcelSort {

    private static int row1 = 4;
    private static int row2 = 3;




    public static void main(String[] args) throws Exception {
        List<String[]> target1 = ExcelRead.readExcel("./target1.xls");
        List<String[]> target2 = ExcelRead.readExcel("./target2.xls");

        String[] tar2Head = target2.get(0);
        ExcelWrite newExc = new ExcelWrite("./newExce.xls",tar2Head);
        boolean hasNumIn2 = false;
        for(int i=1;i<target1.size();i++){
            String t1Num = removeT(target1.get(i)[row1]);
            for(int j=1;j<target2.size();j++){
                String t2Num = removeT(target2.get(j)[row2]);
                if(t1Num.equals(t2Num)){
                    newExc.load(target2.get(j));
                    hasNumIn2 = true;
                }
            }
            if(hasNumIn2){
                System.out.println(Arrays.toString(target1.get(i)));
            }
        }

        newExc.close();




    }

    private static String removeT(String str){
        str = str.replaceAll("\t","");
        return str.trim();
    }





}
