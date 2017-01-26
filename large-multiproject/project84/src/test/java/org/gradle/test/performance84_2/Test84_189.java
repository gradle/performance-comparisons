package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_189 {
    private final Production84_189 production = new Production84_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}