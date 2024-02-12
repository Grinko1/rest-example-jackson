package org.example;

public class ReqResponse {
    private Data data;
    private Support support;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    @Override
    public String toString() {
        return "ReqResponse{" +
                "data=" + data +
                ", support=" + support +
                '}';
    }
}
 class Data{
    private int id;
    private String Email;
    private String first_name;
     private String last_name;
     private String avatar;



     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getEmail() {
         return Email;
     }

     public void setEmail(String email) {
         Email = email;
     }

     public String getFirst_name() {
         return first_name;
     }

     public void setFirst_name(String first_name) {
         this.first_name = first_name;
     }

     public String getLast_name() {
         return last_name;
     }

     public void setLast_name(String last_name) {
         this.last_name = last_name;
     }

     public String getAvatar() {
         return avatar;
     }

     public void setAvatar(String avatar) {
         this.avatar = avatar;
     }

     @Override
     public String toString() {
         return "Data{" +
                 "id=" + id +
                 ", Email='" + Email + '\'' +
                 ", first_name='" + first_name + '\'' +
                 ", last_name='" + last_name + '\'' +
                 ", avatar='" + avatar + '\'' +
                 '}';
     }
 }
class Support{
    private String url;
    private String text;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Support{" +
                "url='" + url + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}