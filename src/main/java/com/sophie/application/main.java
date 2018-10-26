package com.sophie.application;

import com.jfinal.core.JFinal;

public class main {
   public static void main(String[] args) {
	   JFinal.start("src/main/webapp", 80, "/", 5);
}
}
