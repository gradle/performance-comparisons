package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49906 {
    private final Productionnull_49906 production = new Productionnull_49906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}