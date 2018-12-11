package tools;

import org.junit.Test;

import java.util.List;

public class TestExcelWrite {
    @Test
    public void test() throws Exception {

        List<String[]> list1 = ExcelRead.readExcel("./11.xls");
        System.out.println();

        List<String[]> list2 = ExcelRead.readExcel("./22.xls");
        String[] arr =  getName(list2,13);

        ExcelWrite ew = new ExcelWrite("./target.xls",list2.get(0),0);
        int[] arrr = new int[list2.size()-1];
        for(int i=1;i<list1.size();i++){
            int line = 0;
            String name = list1.get(i)[2].trim();
            for(int j=1;j<arr.length;j++){
                String str = arr[j].trim();
                if(name.equals(str)){
                    line = j;
                    arrr[i] = line;

                    break;
                }
            }
            ew.load(list2.get(line));

        }

        ew.close();
    }

    private String[] getName(List<String[]> list,int nameCol){
        String[] arr = new String[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i)[nameCol];
        }
        return arr;
    }

}
