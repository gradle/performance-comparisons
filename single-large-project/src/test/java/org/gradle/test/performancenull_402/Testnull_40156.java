package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40156 {
    private final Productionnull_40156 production = new Productionnull_40156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}