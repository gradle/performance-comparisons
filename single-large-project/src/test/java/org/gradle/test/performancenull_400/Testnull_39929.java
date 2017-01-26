package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39929 {
    private final Productionnull_39929 production = new Productionnull_39929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}