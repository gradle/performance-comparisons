package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_189 {
    private final Production55_189 production = new Production55_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}