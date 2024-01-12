package com.example.test.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

  // @Autowired
  // TreeSectionRepo treeSectionRepo;

  // private void printList(List<?> list) {
  //   System.out.println("출력!");
  //   for (Object object : list) {
  //     System.out.println(object.toString());
  //   }
  // }

  // public List<TreeSectionDTO> getTreeSectionDTOs() {
  //   List<List<TreeSection>> listTreeSections = new ArrayList<>();
  //   listTreeSections.add(treeSectionRepo.findBySectionParentCd("#"));
  //   List<TreeSection> parents = listTreeSections.get(0);
  //   while (true) {
  //     List<TreeSection> chilrens = treeSectionRepo.findAllIncludesSectionCds(getCodes(parents));
  //     // List<TreeSection> chilrens = null;
  //     if (chilrens.size() == 0)
  //       break;
  //     listTreeSections.add(chilrens);
  //     parents = chilrens;
  //   }

  //   List<List<TreeSectionDTO>> listTreeSectionDTOs = new ArrayList<>();
  //   for (List<TreeSection> list : listTreeSections) {
  //     listTreeSectionDTOs.add(treeSectionsToDtos(list));
  //   }

  //   return makeTreeSection(listTreeSectionDTOs);
  // }

  // private List<String> getCodes(List<TreeSection> treeSEctions) {
  //   List<String> sectionCodes = new ArrayList();
  //   for (TreeSection treeSection : treeSEctions) {
  //     sectionCodes.add(treeSection.getSectionCd());
  //   }
  //   return sectionCodes;
  // }

  // private List<TreeSectionDTO> treeSectionsToDtos(List<TreeSection> treeSections) {
  //   List<TreeSectionDTO> treeSectionDTOs = new ArrayList<>();
  //   for (TreeSection treeSection : treeSections) {
  //     treeSectionDTOs.add(TreeSectionDTO.toDto(treeSection));
  //   }
  //   return treeSectionDTOs;
  // }

  // private List<TreeSectionDTO> makeTreeSection(List<List<TreeSectionDTO>> listTreeSections) {
  //   for (int i = listTreeSections.size() - 2; i >= 0; i--) {
  //     List<TreeSectionDTO> parents = listTreeSections.get(i);
  //     for (TreeSectionDTO parent : parents) {
  //       parent.setTreeSectionDTOs(getBySectionCode(listTreeSections.get(i + 1), parent.getSectionCd()));
  //     }
  //   }

  //   return listTreeSections.get(0);
  // }

  // private List<TreeSectionDTO> getBySectionCode(List<TreeSectionDTO> childrens, String sectionCode) {
  //   List<TreeSectionDTO> filteredTreeSections = new ArrayList<>();
  //   for (TreeSectionDTO treeSection : childrens) {
  //     if (treeSection.getSectionParentCd().equals(sectionCode)) {
  //       filteredTreeSections.add(treeSection);
  //     }
  //   }
  //   return filteredTreeSections.size() == 0 ? null : filteredTreeSections;
  // }
}
