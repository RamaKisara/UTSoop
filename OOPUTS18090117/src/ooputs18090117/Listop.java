/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooputs18090117;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author RamaPC
 */
public class Listop {
     private static List<kelasData> listData = new LinkedList<kelasData>();

    public static void addData(kelasData data) {
        listData.add(data);
    }

    public static void editData(kelasData data, int idx) {
        listData.set(idx, data);
    }

    public static void removeData(int idx) {
        listData.remove(idx);
    }

    public static List<kelasData> getListData() {
        return listData;
    }

}
