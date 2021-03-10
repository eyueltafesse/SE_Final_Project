package com.mumscheddemo.MUMSchedEntryBlockDemo.controller;



import com.mumscheddemo.MUMSchedEntryBlockDemo.domain.Block;

import com.mumscheddemo.MUMSchedEntryBlockDemo.service.BlockService;
import org.hibernate.service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BlockControl {

        @Autowired
        private BlockService service;

        // handler methods...
        @RequestMapping("/")
        public String viewHomePage(Model model) {
            List<Block> listBlock = service.listAll();
            model.addAttribute("listBlock", listBlock);

            return "index";
        }
    }


