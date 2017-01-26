package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28186 {
    private final Productionnull_28186 production = new Productionnull_28186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}