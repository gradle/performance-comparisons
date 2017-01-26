package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1686 {
    private final Productionnull_1686 production = new Productionnull_1686("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}