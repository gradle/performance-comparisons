package org.gradle.test.performancenull_52;

import static org.junit.Assert.*;

public class Testnull_5183 {
    private final Productionnull_5183 production = new Productionnull_5183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}