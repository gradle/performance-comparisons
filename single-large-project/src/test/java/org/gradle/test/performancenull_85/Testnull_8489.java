package org.gradle.test.performancenull_85;

import static org.junit.Assert.*;

public class Testnull_8489 {
    private final Productionnull_8489 production = new Productionnull_8489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}