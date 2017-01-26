package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4125 {
    private final Productionnull_4125 production = new Productionnull_4125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}