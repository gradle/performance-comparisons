package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29954 {
    private final Productionnull_29954 production = new Productionnull_29954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}