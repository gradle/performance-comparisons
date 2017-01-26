package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_189 {
    private final Production75_189 production = new Production75_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}