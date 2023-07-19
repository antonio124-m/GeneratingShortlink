package com.antonio.shortlink.Service;

import com.antonio.shortlink.Modal.Url;
import com.antonio.shortlink.Repository.UrlRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URL;

import static com.antonio.shortlink.UrlLogic.GenerateShortlink.IsUrlValid;
import static com.antonio.shortlink.UrlLogic.GenerateShortlink.getShortlink;

@Service
public class UrlService {
    @Autowired
     private   UrlRepos urlRepos;
    public String getOriginalUrl(String id) {

        return urlRepos.findByShortlink(id);

    }

    public Url genarateShortlink(String url) {

        if ( ! IsUrlValid(url)){
            System.out.println("Url is not valid");
            return  null;
        }
         Url  urlObject = new Url();
        urlObject.setOrginallink(url);
        urlObject.setShortlink(getShortlink(url));

        return urlRepos.save(urlObject);



    }
}
