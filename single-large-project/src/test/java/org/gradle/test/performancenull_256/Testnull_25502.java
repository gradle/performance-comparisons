package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25502 {
    private final Productionnull_25502 production = new Productionnull_25502("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}