
package com.poly.lab3.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Quiz {

    @SerializedName("quiz")
    @Expose
    private Quiz_ quiz;

    public Quiz_ getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz_ quiz) {
        this.quiz = quiz;
    }

}
