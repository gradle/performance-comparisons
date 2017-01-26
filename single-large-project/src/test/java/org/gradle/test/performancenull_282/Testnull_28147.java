package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28147 {
    private final Productionnull_28147 production = new Productionnull_28147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}