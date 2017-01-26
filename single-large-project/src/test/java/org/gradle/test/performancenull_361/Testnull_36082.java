package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36082 {
    private final Productionnull_36082 production = new Productionnull_36082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}