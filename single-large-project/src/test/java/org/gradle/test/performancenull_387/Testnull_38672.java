package org.gradle.test.performancenull_387;

import static org.junit.Assert.*;

public class Testnull_38672 {
    private final Productionnull_38672 production = new Productionnull_38672("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}