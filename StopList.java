/**
 * Created by owensullivan on 4/15/16.
 */
public class StopList {
    public static Stop TargetField = new Stop(null,null,1);
    public static Stop Warehouse = new Stop(TargetField,null,2);
    public static Stop NicolletMall = new Stop(Warehouse,null,3);
    public static Stop GovernmentPlaza = new Stop(NicolletMall,null,4);
    public static Stop USBankStadium = new Stop(GovernmentPlaza,null,5);
    public static Stop WestBank = new Stop(USBankStadium,null,6);
    public static Stop EastBank = new Stop(WestBank,null,7);
    public static Stop StadiumVillage = new Stop(EastBank,null,8);
    public static Stop ProspectPark = new Stop(StadiumVillage,null,9);
    public static Stop Westgate = new Stop(ProspectPark,null,10);
    public static Stop Raymond = new Stop(Westgate,null,11);
    public static Stop Fairview = new Stop(Raymond,null,12);
    public static Stop Snelling = new Stop(Fairview,null,13);
    public static Stop Hamline = new Stop(Snelling,null,14);
    public static Stop Lexington = new Stop(Hamline,null,15);
    public static Stop Victoria = new Stop(Lexington,null,16);
    public static Stop Dale = new Stop(Victoria,null,17);
    public static Stop Western = new Stop(Dale,null,18);
    public static Stop CapitolRice = new Stop(Western,null,19);
    public static Stop Robert = new Stop(CapitolRice,null,20);
    public static Stop Tenth = new Stop(Robert,null,21);
    public static Stop Central = new Stop(Tenth,null,22);
    public static Stop UnionDepot = new Stop(Central,null,23);

    public StopList(){
        TargetField.setEast(Warehouse);
        Warehouse.setEast(NicolletMall);
        NicolletMall.setEast(GovernmentPlaza);
        GovernmentPlaza.setEast(USBankStadium);
        USBankStadium.setEast(WestBank);
        WestBank.setEast(EastBank);
        EastBank.setEast(StadiumVillage);
        StadiumVillage.setEast(ProspectPark);
        ProspectPark.setEast(Westgate);
        Westgate.setEast(Raymond);
        Raymond.setEast(Fairview);
        Fairview.setEast(Snelling);
        Snelling.setEast(Hamline);
        Hamline.setEast(Lexington);
        Lexington.setEast(Victoria);
        Victoria.setEast(Dale);
        Dale.setEast(Western);
        Western.setEast(CapitolRice);
        CapitolRice.setEast(Robert);
        Robert.setEast(Tenth);
        Tenth.setEast(Central);
    }

    public Stop setFromStopNumber(int StopNumber){
        if (StopNumber<=23 && StopNumber>=1) {
            Stop stop = TargetField;
            while (stop.getStopNumber() != StopNumber) {
                stop = stop.getEast();
            }
            return stop;
        }
        else {return null;}
    }
}
