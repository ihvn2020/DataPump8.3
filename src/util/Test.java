/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.Months;

/**
 *
 * @author The Bright
 */
public class Test {
    
    public static void main(String[] arg){
        DateTime d1=new DateTime(new Date());
        DateTime d2=d1.plusMonths(6);
        System.out.println(Months.monthsBetween(d1,d2).getMonths());
    }

}
