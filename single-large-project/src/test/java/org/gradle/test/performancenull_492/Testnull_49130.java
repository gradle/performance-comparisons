package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49130 {
    private final Productionnull_49130 production = new Productionnull_49130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}