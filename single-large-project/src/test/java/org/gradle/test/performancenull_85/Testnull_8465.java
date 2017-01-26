package org.gradle.test.performancenull_85;

import static org.junit.Assert.*;

public class Testnull_8465 {
    private final Productionnull_8465 production = new Productionnull_8465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}