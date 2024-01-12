package com.example.test.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
// @Entity(name = "tree_section")
public class TreeSection {
  
  // @Id
  // @Column(name="section_cd")
  private String section_cd;
  // @Column(name="section_info")
  private String section_info;
  // @Column(name="section_parent_cd")
  private String section_parent_cd;
}
