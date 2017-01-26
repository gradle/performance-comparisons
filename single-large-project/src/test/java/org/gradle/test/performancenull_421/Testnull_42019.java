package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42019 {
    private final Productionnull_42019 production = new Productionnull_42019("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}