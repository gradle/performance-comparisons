package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43926 {
    private final Productionnull_43926 production = new Productionnull_43926("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}