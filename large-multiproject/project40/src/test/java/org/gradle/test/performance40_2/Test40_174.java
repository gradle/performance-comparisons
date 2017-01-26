package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_174 {
    private final Production40_174 production = new Production40_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}