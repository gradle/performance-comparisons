package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34496 {
    private final Productionnull_34496 production = new Productionnull_34496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}