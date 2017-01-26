package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49138 {
    private final Productionnull_49138 production = new Productionnull_49138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}