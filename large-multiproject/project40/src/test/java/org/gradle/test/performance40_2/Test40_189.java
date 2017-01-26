package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_189 {
    private final Production40_189 production = new Production40_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}