package org.gradle.test.performancenull_387;

import static org.junit.Assert.*;

public class Testnull_38648 {
    private final Productionnull_38648 production = new Productionnull_38648("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}