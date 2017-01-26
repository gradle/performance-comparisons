package org.gradle.test.performancenull_82;

import static org.junit.Assert.*;

public class Testnull_8190 {
    private final Productionnull_8190 production = new Productionnull_8190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}