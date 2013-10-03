package org.adoptopenjdk.lambda.tutorial.exercise4;

/*
 * #%L
 * lambda-tutorial
 * %%
 * Copyright (C) 2013 Adopt OpenJDK
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

import org.adoptopenjdk.lambda.tutorial.exercise4.Document.Page;

public class Printers {
    public static void print(String s) {
        System.out.println(s);
    }

    public static void printPages(Document doc, Integer... pageNumbers) {
        Arrays.stream(pageNumbers).map(doc::getPageContent).forEach(Printers::print);
    }

    public static Stream<Page> createPagesFrom(Stream<String> contents) {
        return contents.map(Page::new);
    }

}
