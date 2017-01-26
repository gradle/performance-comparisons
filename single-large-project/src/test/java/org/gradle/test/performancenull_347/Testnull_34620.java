package org.gradle.test.performancenull_347;

import static org.junit.Assert.*;

public class Testnull_34620 {
    private final Productionnull_34620 production = new Productionnull_34620("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}