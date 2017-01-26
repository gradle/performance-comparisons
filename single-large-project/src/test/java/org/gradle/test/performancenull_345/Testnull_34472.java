package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34472 {
    private final Productionnull_34472 production = new Productionnull_34472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}