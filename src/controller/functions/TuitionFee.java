package controller.functions;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class TuitionFee {
    static double fee = 0;

    public static void setFee(double fee) {
        TuitionFee.fee = fee;
    }

    public static void addFee(double fee) {
        TuitionFee.fee += fee;
    }

    public static void subtractFee(double fee) {
        TuitionFee.fee -= fee;
    }

    public static void resetFee() {
        TuitionFee.fee = 0;
    }

    public static String getFee() {
        NumberFormat formatter = new DecimalFormat("#,###");
        String newFee = formatter.format(fee);
        return newFee;
    }
}
