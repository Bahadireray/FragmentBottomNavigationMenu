package com.bahadireray.gezgin.Model;

public class Data {

    private String dataPicture_title,dataPicture,dataScore,dataTextTitle,dataText;
    private int data_id;

    public Data() {
    }

    public Data(String dataPicture_title, String dataPicture, String dataScore, String dataTextTitle, String dataText, int data_id) {
        this.dataPicture_title = dataPicture_title;
        this.dataPicture = dataPicture;
        this.dataScore = dataScore;
        this.dataTextTitle = dataTextTitle;
        this.dataText = dataText;
        this.data_id = data_id;
    }


    public String getDataPicture_title() {
        return dataPicture_title;
    }

    public void setDataPicture_title(String dataPicture_title) {
        this.dataPicture_title = dataPicture_title;
    }

    public String getDataPicture() {
        return dataPicture;
    }

    public void setDataPicture(String dataPicture) {
        this.dataPicture = dataPicture;
    }

    public String getDataScore() {
        return dataScore;
    }

    public void setDataScore(String dataScore) {
        this.dataScore = dataScore;
    }

    public String getDataTextTitle() {
        return dataTextTitle;
    }

    public void setDataTextTitle(String dataTextTitle) {
        this.dataTextTitle = dataTextTitle;
    }

    public String getDataText() {
        return dataText;
    }

    public void setDataText(String dataText) {
        this.dataText = dataText;
    }

    public int getData_id() {
        return data_id;
    }

    public void setData_id(int data_id) {
        this.data_id = data_id;
    }
}
