package pl.bykowski.springbootvalidate.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Movie {


    @NotNull(message = "name cannot be null")
    @Size(min = 2)
    private String name;

    @Min(2000)
    @Max(2020)
    private int year;

    @Email
    @NotNull
    private String reportersMail;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getReportersMail() {
        return reportersMail;
    }

    public void setReportersMail(String reportersMail) {
        this.reportersMail = reportersMail;
    }
}
