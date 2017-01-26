package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21736 {
    private final Productionnull_21736 production = new Productionnull_21736("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}