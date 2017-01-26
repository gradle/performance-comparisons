package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49170 {
    private final Productionnull_49170 production = new Productionnull_49170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}