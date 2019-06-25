package com.company;

class Book {
    String code="000" ; //รหัสหนังสือ
    String bookname="" ;  //ชื่อหนังสือ
    String status="" ; // สถานะ
    String date =""; //วันเวลา
    int group ; // หมวดหมู่ของหนังสือ

    public Book() {

    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Book(String code, String bookname, String status, String date, int group) {
        this.code = code;
        this.bookname = bookname;
        this.status = status;
        this.date = date;
        this.group = group;
    }
    public void printBook (){
        System.out.println(
                "รหัสหนังสือ : "+this.code+"\n "+
                "ชื่อหนังสือ  : "+this.bookname+"\n "+
                "สถานะของหนังสือ : "+this.status+"\n "+
                "วันที่ทำการยืมหนังสือ : "+this.date+"\n "+
                "หมวดหมู่ของหนังสือ : "+this.group);

    }
}
