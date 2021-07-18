public class SerialNumber {

    private int number;
    private String serialNumber = "Error";

    public void setNumber(int number) {
        this.number = number;
        String numb = "" + number;
        numb = String.valueOf(numb.charAt(numb.length()-1));
        switch (numb) {
            case "1": serialNumber = number + "st";
            break;
            case "2": serialNumber = number + "nd";
            break;
            case "3": serialNumber = number + "rd";
            break;
            default: serialNumber = number + "th";
            break;
        }
    }

    public String getSerialNumber() {
        return serialNumber;
    }


}