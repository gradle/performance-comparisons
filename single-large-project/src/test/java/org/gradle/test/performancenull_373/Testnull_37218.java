package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37218 {
    private final Productionnull_37218 production = new Productionnull_37218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}