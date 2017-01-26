package org.gradle.test.performancenull_37;

import static org.junit.Assert.*;

public class Testnull_3679 {
    private final Productionnull_3679 production = new Productionnull_3679("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}