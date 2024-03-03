package org.example.Radio;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = minStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int curreentVolume = minVolume;

    public Radio() {
        this.maxStation = maxStation;
    }

    public Radio(int amountStation) {
        this.maxStation = amountStation - 1;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }


    public int getCurrentVolume() {
        return curreentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        curreentVolume = newCurrentVolume;
    }

    public void setToMaxStation() {
        currentStation = maxStation;
    }

    public void setToMinStation() {
        currentStation = minStation;
    }

    public void setToMaxVolume() {
        curreentVolume = maxVolume;
    }

    public void setToMinVolume() {
        curreentVolume = minVolume;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else setToMinStation();

    }

    public void augmentVolume() {
        if (curreentVolume < maxVolume) {
            curreentVolume = curreentVolume + 1;
        } else setToMaxVolume();
    }

    public void prevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            setToMaxStation();
        }
    }

    public void decrementVolume() {
        if (curreentVolume > minVolume) {
            curreentVolume = curreentVolume - 1;
        } else {
            setToMinVolume();
        }
    }
}












