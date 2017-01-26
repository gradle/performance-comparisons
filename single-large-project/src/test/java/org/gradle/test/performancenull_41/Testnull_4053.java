package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4053 {
    private final Productionnull_4053 production = new Productionnull_4053("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}