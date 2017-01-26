package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18289 {
    private final Productionnull_18289 production = new Productionnull_18289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}