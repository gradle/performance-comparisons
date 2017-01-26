package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29963 {
    private final Productionnull_29963 production = new Productionnull_29963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}