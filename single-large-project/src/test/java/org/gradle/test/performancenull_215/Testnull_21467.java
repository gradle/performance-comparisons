package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21467 {
    private final Productionnull_21467 production = new Productionnull_21467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}