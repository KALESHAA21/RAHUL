package test;

import utility.Autoutil;
import utility.Iconst;

public class XlData implements Iconst
{
public static void main(String[] args) throws Exception {
	String value = Autoutil.getdata(XL_PATH, "AB", 0, 0);
	System.out.println(value);
	Autoutil.getscreenshot(null, value, value);
}
}
