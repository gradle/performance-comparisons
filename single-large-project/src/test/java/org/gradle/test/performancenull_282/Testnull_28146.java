package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28146 {
    private final Productionnull_28146 production = new Productionnull_28146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}