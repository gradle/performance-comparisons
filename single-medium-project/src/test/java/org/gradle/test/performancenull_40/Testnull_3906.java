package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3906 {
    private final Productionnull_3906 production = new Productionnull_3906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}