package com.example.test.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @Autowired
  TestService testService;
  
  // @GetMapping("/test")
  // public List<TreeSectionDTO> getTreeSectionDTOs(){
  //   return testService.getTreeSectionDTOs();
  
  @GetMapping("/test")
  public TreeSectionDTO getTreeSectionDTO(){
    TreeSection treeSection = new TreeSection("sectioncd", "sectioninfo","sectionaprentcd");
    return TreeSectionDTO.toDto(treeSection);
  }
}
