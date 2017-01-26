package org.gradle.test.performancenull_85;

import static org.junit.Assert.*;

public class Testnull_8490 {
    private final Productionnull_8490 production = new Productionnull_8490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}