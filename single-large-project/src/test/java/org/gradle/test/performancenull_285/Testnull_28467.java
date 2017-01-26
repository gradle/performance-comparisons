package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28467 {
    private final Productionnull_28467 production = new Productionnull_28467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}