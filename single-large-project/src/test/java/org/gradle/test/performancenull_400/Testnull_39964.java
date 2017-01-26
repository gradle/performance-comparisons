package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39964 {
    private final Productionnull_39964 production = new Productionnull_39964("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}