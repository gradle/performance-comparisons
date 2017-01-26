package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6330 {
    private final Productionnull_6330 production = new Productionnull_6330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}