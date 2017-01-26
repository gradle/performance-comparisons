package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22042 {
    private final Productionnull_22042 production = new Productionnull_22042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}