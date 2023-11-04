/*
 * Problem 1
 * 
 * Your school has provided you with a laptop computer! 
 * However, they insist on putting a laptop sticker with their logo on your new computer. 
 * That sticker might be very large, and it can’t be rotated! Will it fit, with one centimeter to spare on all sides?
 * 
 * Input
 * The single line of input contains four integers: wc, hc, ws and hs where (1 <= wc,hc,ws,hs<=1000):
 * wc is the width of your new laptop computer, 
 * hc is the height of your new laptop computer, 
 * ws is the width of the laptop sticker, and 
 * hs is the height of the laptop sticker. All measurements are in centimeters.
 * 
 * Output
 * Output a boolean, which is:
 * True if the laptop sticker will fit on your new laptop computer, without rotating, but with one centimeter space on all sides
 * False if the laptop sticker won’t fit.
 * 
 */

public class Problem1 {

    public static boolean stickerCheck(int wc, int hc, int ws, int hs) {
        boolean stickerFit;
        int widthSpace = wc - ws;
        int heightSpace = hc - hs;

        if (widthSpace >= 1 && heightSpace >= 1) {
            stickerFit = true;
        } else {
            stickerFit = false;
        }

        return stickerFit;
    }
}
