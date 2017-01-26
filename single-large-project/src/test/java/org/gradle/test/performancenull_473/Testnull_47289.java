package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47289 {
    private final Productionnull_47289 production = new Productionnull_47289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}