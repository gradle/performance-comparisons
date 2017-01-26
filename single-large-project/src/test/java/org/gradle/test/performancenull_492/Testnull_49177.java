package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49177 {
    private final Productionnull_49177 production = new Productionnull_49177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}