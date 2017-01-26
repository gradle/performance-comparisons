package org.gradle.test.performancenull_82;

import static org.junit.Assert.*;

public class Testnull_8198 {
    private final Productionnull_8198 production = new Productionnull_8198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}