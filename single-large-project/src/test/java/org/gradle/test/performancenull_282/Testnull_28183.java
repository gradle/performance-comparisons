package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28183 {
    private final Productionnull_28183 production = new Productionnull_28183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}