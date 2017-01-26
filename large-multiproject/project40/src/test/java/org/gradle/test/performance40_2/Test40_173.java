package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_173 {
    private final Production40_173 production = new Production40_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}