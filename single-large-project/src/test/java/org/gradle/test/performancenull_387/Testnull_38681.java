package org.gradle.test.performancenull_387;

import static org.junit.Assert.*;

public class Testnull_38681 {
    private final Productionnull_38681 production = new Productionnull_38681("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}