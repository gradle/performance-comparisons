package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42049 {
    private final Productionnull_42049 production = new Productionnull_42049("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}