package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42183 {
    private final Productionnull_42183 production = new Productionnull_42183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}