package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36060 {
    private final Productionnull_36060 production = new Productionnull_36060("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}