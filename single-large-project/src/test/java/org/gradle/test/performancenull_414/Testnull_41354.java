package org.gradle.test.performancenull_414;

import static org.junit.Assert.*;

public class Testnull_41354 {
    private final Productionnull_41354 production = new Productionnull_41354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}