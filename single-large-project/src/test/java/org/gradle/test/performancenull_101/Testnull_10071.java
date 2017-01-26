package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10071 {
    private final Productionnull_10071 production = new Productionnull_10071("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}