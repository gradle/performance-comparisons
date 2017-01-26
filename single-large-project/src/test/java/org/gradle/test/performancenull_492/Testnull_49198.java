package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49198 {
    private final Productionnull_49198 production = new Productionnull_49198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}