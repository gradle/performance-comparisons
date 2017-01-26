package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34994 {
    private final Productionnull_34994 production = new Productionnull_34994("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}