package org.gradle.test.performancenull_85;

import static org.junit.Assert.*;

public class Testnull_8435 {
    private final Productionnull_8435 production = new Productionnull_8435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}