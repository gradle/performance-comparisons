package org.gradle.test.performancenull_70;

import static org.junit.Assert.*;

public class Testnull_6906 {
    private final Productionnull_6906 production = new Productionnull_6906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}