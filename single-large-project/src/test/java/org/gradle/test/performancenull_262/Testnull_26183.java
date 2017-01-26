package org.gradle.test.performancenull_262;

import static org.junit.Assert.*;

public class Testnull_26183 {
    private final Productionnull_26183 production = new Productionnull_26183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}