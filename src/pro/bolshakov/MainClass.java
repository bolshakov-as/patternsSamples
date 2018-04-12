package pro.bolshakov;

import java.util.regex.Pattern;

public class MainClass {

    private static String str = "2018-03-20_11:10:39.690 [http-transport-3] INFO  r.s.e.a.e.t.l.s.m.DcbOvpMessageCounter - <?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><FIXML_BATCH><FIXML><BATCH><Hdr MsgID=\"7eadeb6a98d445768071f49bca12c363\" SeqNum=\"13\" SndCompId=\"APAM1\" SendingTime=\"20180320-08:10:39.644\" TrgtCompId=\"OVP\" SID=\"EFX_DEV\" TID=\"SASH\"/><ExecRpt Acct=\"YZSB\" ClOrdID=\"USD/RUB_1521533416617_10013\" CumQty=\"72463.68\" ExecID=\"584281\" ID=\"USD/RUB_1521533416617_10013\" LastPx=\"60.3864\" LastQty=\"1200.0\" OrdID=\"15215334301\" OrdStat=\"2\" PeggedPx=\"60.3792\" Px=\"60.3864\" PxTyp=\"2\" Side=\"1\" TxnTm=\"20180320-08:10:39.599\" Txt=\"filled 1200@60.3864\"><Instrmt Mult=\"1\" Prod=\"4\" SecTyp=\"FXSPOT\" Sym=\"USD/RUB\"/></ExecRpt></BATCH></FIXML></FIXML_BATCH>";

    public static void main(String[] args) {

//        Pattern pattern = Pattern.compile(".*?TrgtCompId=\"OVP\".*?ExecRpt.*?");
//        Pattern pattern = Pattern.compile(".*?version.*?");
//        System.out.println(pattern.matcher(str).matches());

        Object o = false;
        System.out.println(Boolean.TRUE.equals(o));

    }

}
