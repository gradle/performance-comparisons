package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_189 {
    private final Production11_189 production = new Production11_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}