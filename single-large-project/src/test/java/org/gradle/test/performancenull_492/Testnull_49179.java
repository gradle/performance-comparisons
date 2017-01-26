package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49179 {
    private final Productionnull_49179 production = new Productionnull_49179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}