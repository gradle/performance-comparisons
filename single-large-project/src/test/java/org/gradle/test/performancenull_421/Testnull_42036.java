package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42036 {
    private final Productionnull_42036 production = new Productionnull_42036("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}