package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29906 {
    private final Productionnull_29906 production = new Productionnull_29906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}