package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31270 {
    private final Productionnull_31270 production = new Productionnull_31270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}