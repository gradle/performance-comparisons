package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25596 {
    private final Productionnull_25596 production = new Productionnull_25596("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}