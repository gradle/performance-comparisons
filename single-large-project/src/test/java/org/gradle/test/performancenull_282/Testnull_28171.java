package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28171 {
    private final Productionnull_28171 production = new Productionnull_28171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}