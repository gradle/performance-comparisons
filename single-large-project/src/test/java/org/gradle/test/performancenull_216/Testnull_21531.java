package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21531 {
    private final Productionnull_21531 production = new Productionnull_21531("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}