package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28138 {
    private final Productionnull_28138 production = new Productionnull_28138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}