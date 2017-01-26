package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_189 {
    private final Production13_189 production = new Production13_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}