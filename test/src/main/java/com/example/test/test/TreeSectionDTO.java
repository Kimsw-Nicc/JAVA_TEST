package com.example.test.test;

import java.util.List;

import org.modelmapper.ModelMapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TreeSectionDTO {
  
  private String sectionCd;
  private String sectionInfo;
  private String sectionParentCd;

  private List<TreeSectionDTO> treeSectionDTOs;


  public TreeSection toEntity(){
    ModelMapper modelmapper = new ModelMapper();
    return modelmapper.map(this, TreeSection.class);
  }

  public static TreeSectionDTO toDto(TreeSection treeSection){
    ModelMapper modelmapper = new ModelMapper();
    return modelmapper.map(treeSection, TreeSectionDTO.class);
  }
}
