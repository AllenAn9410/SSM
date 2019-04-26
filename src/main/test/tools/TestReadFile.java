package tools;

import org.junit.Test;

import java.math.BigDecimal;

public class TestReadFile {
    @Test
    public void test() {
        String res = ReadFile.read("./pom.xml");
        System.out.println(res);

    }

    @Test
    public void test2(){
       int a =  ReadFile.count("./反叛的大魔王.txt");
       System.err.println(a);

       StringBuilder b = new StringBuilder();
       b.append("1");
    }

    @Test
    public void test3(){
        String temp = "UPDATE EXIMTRX.REFI_MASTER SET BRANCH_ADD1_DOC = '34 Cua Nam Street',BRANCH_ADD2_DOC = 'Hoan Kiem District',BRANCH_ADD3_DOC = 'Ha Noi , Vietnam',BRANCH_ADD_DOC = '34 Cua Nam StreetHoan Kiem DistrictHa Noi , Vietnam',BRANCH_FAX_DOC = '',BRANCH_NM_DOC = 'VTB Main Operation Center',BRANCH_OWNER = '010898',BRANCH_SWFT_DOC = 'ICBVVNVX108',BRANCH_TAX_DOC = '0100111948-143',BRANCH_TEL_DOC = '123456',BRANCH_VN_ADD1_DOC = '108 TRAN HUNG DAO, QUAN HOAN KIEM,',BRANCH_VN_ADD2_DOC = '208 TRAN HUNG DAO, QUAN HOAN KIEM',BRANCH_VN_ADD3_DOC = '308 TRAN HUNG DAO, QUAN HOAN KIEM,',BRANCH_VN_NM_DOC = 'NHTMCP C?ng Th??ng VN, So Giao dich',BU = '010898',CLERK_ID = 'KTB_USER3',CLOSE_FLG = 'No',COST_CENTER = '205000',CURRENT_STATUS = 'Edit Register',CURR_STATUS = 'Edit Register',CUST_CLSS_NEW = 0,CUST_CLSS_ORG = null,CUST_RANK = '',C_FUNC_SHORT_NAME = 'EditRegister',C_MAIN_REF = '0108RF1701536',C_NOW_EVENT = 'Maintenance',C_TRX_REF = '0108RF1701536',D_SVR_GMT = TO_DATE('2019-04-23','YYYY-MM-DD'),EXCL_CHB = '',EXLC_CHB = '',IMCL_CHB = '',INTERCOMPANY_CODE = '',INT_USER = 'KTB_USER3',LOGIN_TIME = '16:15:40',NEXT_STATUS = '',OTHER_CHB = '',OTHER_INSTRUMENT = '',OTH_DETAIL = '',PROCESS_BR_NM = 'VTB_VMOC_HANOI',PROD_TYPE = 'RF',REFI_AMT = 1000,REFI_BAL = 0,REFI_BK_ADD = 'ANNA-LOUISA-KARSCH-STRASSE 2',REFI_BK_CIF = '',REFI_BK_CNTY_CODE = 'DE',REFI_BK_CNTY_NM = 'GERMANY',REFI_BK_ID = 'AARBDE5W100',REFI_BK_ITCPN_CD = '',REFI_BK_MED = '',REFI_BK_NAME = 'AAREAL BANK AG',REFI_BK_SW = 'AARBDE5W100',REFI_CCY = 'VND',REFI_FLAG = 'Bank',REFI_LC_DO_NO = null,REFI_TYPE = 'ECA',TRX_DT = TO_DATE('2017-12-01','YYYY-MM-DD'),T_SVR_GMT = TO_DATE('2019-04-23 17:15:40','YYYY-MM-DD HH24:MI:SS'),USER_BRANCH = '019901',USER_BRANCH_ADD1_EN = '019901 branch address1',USER_BRANCH_ADD1_VN = '108 TRAN HUNG DAO, QUAN HOAN KIEM,',USER_BRANCH_ADD2_EN = '',USER_BRANCH_ADD2_VN = '108 TRAN HUNG DAO, QUAN HOAN KIEM',USER_BRANCH_ADD3_EN = '019901 branch address3',USER_BRANCH_ADD3_VN = '308 TRAN HUNG DAO, QUAN HOAN KIEM,',USER_BRANCH_FAX = '0123',USER_BRANCH_NM = '019901 branch name',USER_BRANCH_NM_VN = '019901 branch name',USER_BRANCH_SWFT = 'ICBVVNVXXXX',USER_BRANCH_TEL = '01256623',C_TRX_STATUS = 'W',C_LOCKED_FLAG = 'F',C_LOCKED_OP = '',C_CP_UNIT_CODE = '019901',C_LOCK_FUNC_ID = 'F05030701913',I_EVENT_TIMES = 2,I_CANCEL_ETIMES = 2,C_USER_ID = 'KTB_USER3',D_SYS_OP_DATE = TO_DATE('2019-04-23','YYYY-MM-DD'),T_SYS_OP_TIME = TO_DATE('2019-04-23 17:15:49','YYYY-MM-DD HH24:MI:SS'),D_SYS_REL_DATE = TO_DATE('2019-04-23','YYYY-MM-DD'),T_SYS_REL_TIME = TO_DATE('2019-04-23 17:15:49','YYYY-MM-DD HH24:MI:SS'),C_RELE_BY = 'KTB_USER3',NOTES = '',NOTES_TRX_WRN = '',NOTICE_BLANK = '',NOTICE_BRANCH = ''  WHERE C_UNIT_CODE='010898' AND C_MAIN_REF='0108RF1701536' ;";
        int index = 0;
        for(int i=0;i<temp.length();i++){
            if(temp.charAt(i)=='='){
                index++;
            }
        }
        System.out.println(index);
    }

    @Test
    public void test4(){
        double a = 2-1.1;
        System.out.println(a);
//        BigDecimal b = new BigDecimal();
    }


}
