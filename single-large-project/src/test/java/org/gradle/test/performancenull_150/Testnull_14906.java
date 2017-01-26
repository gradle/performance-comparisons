package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14906 {
    private final Productionnull_14906 production = new Productionnull_14906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}