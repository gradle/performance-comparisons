package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37415 {
    private final Productionnull_37415 production = new Productionnull_37415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}