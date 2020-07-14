package sg.edu.rp.c346.id_18021531.demotodolist;

import java.util.Calendar;

public class todoitem  {

    private String title;
    private Calendar date;

    public todoitem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "todoitem{" +
                "title='" + title + '\'' +
                ", date=" + date +
                '}';
    }
}
