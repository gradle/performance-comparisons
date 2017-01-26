package org.gradle.test.performancenull_186;

import static org.junit.Assert.*;

public class Testnull_18531 {
    private final Productionnull_18531 production = new Productionnull_18531("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}