
package com.poly.lab3.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Quiz_ {

    @SerializedName("sport")
    @Expose
    private List<Sport> sport = null;
    @SerializedName("maths")
    @Expose
    private List<Math> maths = null;

    public List<Sport> getSport() {
        return sport;
    }

    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }

    public List<Math> getMaths() {
        return maths;
    }

    public void setMaths(List<Math> maths) {
        this.maths = maths;
    }

}
