package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28052 {
    private final Productionnull_28052 production = new Productionnull_28052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}