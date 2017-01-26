package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25594 {
    private final Productionnull_25594 production = new Productionnull_25594("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}