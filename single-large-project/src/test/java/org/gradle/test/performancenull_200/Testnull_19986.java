package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19986 {
    private final Productionnull_19986 production = new Productionnull_19986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}