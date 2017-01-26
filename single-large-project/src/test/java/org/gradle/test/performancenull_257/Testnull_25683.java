package org.gradle.test.performancenull_257;

import static org.junit.Assert.*;

public class Testnull_25683 {
    private final Productionnull_25683 production = new Productionnull_25683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}