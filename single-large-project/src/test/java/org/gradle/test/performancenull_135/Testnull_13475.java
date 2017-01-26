package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13475 {
    private final Productionnull_13475 production = new Productionnull_13475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}