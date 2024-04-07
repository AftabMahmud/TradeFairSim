/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.RegMgr;

/**
 *
 * @author aftab
 */
public class boothskeletion {
    int boothName;
    String boothLocation;
    String boothSize;

    public boothskeletion(int boothName, String boothLocation, String boothSize) {
        this.boothName = boothName;
        this.boothLocation = boothLocation;
        this.boothSize = boothSize;
    }

    public int getBoothName() {
        return boothName;
    }

    public void setBoothName(int boothName) {
        this.boothName = boothName;
    }

    public String getBoothLocation() {
        return boothLocation;
    }

    public void setBoothLocation(String boothLocation) {
        this.boothLocation = boothLocation;
    }

    public String getBoothSize() {
        return boothSize;
    }

    public void setBoothSize(String boothSize) {
        this.boothSize = boothSize;
    }
    
}
