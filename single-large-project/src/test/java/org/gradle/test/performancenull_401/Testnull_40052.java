package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40052 {
    private final Productionnull_40052 production = new Productionnull_40052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}