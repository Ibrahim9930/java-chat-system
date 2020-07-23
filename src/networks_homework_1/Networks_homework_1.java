/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networks_homework_1;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author masri
 */
public class Networks_homework_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChatFrame cf=new ChatFrame();
        cf.setVisible(true);
        while(true){
//            byte recievedData[] = new byte[1024];
//            DatagramPacket rpckt = new DatagramPacket(recievedData,recievedData.length);
            try {
//                cf.sckt.receive(rpckt);
                cf.recieveData();
            } catch (Exception ex) {
//                Logger.getLogger(ChatFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
