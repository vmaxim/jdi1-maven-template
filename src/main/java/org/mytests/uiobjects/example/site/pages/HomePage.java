package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import org.mytests.uiobjects.example.site.SearchResults;

import java.util.List;

@JPage(url = "/index.htm", title = "Index Page")
public class HomePage extends WebPage {
    @Css(".g")
    public List<SearchResults> results;
}
