package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49178 {
    private final Productionnull_49178 production = new Productionnull_49178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}