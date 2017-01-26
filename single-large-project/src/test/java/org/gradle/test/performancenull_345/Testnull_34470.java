package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34470 {
    private final Productionnull_34470 production = new Productionnull_34470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}