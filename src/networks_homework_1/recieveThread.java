/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networks_homework_1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author masri
 */
public class recieveThread extends Thread {

    public ChatFrame cf;
    public recieveThread(ChatFrame cf){
        this.cf = cf;
    }
    @Override
    public void run(){
        while(true){
            byte recievedData[] = new byte[1024];
            DatagramPacket rpckt = new DatagramPacket(recievedData,recievedData.length);
            try {
                cf.sckt.receive(rpckt);
               // cf.recieveData(rpckt);
            } catch (Exception ex) {
//                Logger.getLogger(ChatFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(recieveThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
