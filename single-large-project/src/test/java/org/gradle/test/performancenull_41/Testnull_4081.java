package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4081 {
    private final Productionnull_4081 production = new Productionnull_4081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}