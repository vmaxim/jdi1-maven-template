package org.mytests.uiobjects.example.site;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import org.mytests.uiobjects.example.site.pages.HomePage;

@JSite("https://www.google.ru/search?q=jdi")
public class JDIExampleSite extends WebSite {
    public static HomePage homePage;
}
