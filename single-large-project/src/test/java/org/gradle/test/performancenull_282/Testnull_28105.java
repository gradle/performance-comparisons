package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28105 {
    private final Productionnull_28105 production = new Productionnull_28105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}