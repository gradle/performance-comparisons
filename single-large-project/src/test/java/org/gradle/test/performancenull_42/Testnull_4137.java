package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4137 {
    private final Productionnull_4137 production = new Productionnull_4137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}