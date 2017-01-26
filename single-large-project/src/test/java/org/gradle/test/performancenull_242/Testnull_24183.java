package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24183 {
    private final Productionnull_24183 production = new Productionnull_24183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}