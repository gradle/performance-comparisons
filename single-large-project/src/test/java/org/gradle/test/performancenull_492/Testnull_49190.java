package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49190 {
    private final Productionnull_49190 production = new Productionnull_49190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}