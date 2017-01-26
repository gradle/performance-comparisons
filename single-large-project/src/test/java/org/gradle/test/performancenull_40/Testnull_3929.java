package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3929 {
    private final Productionnull_3929 production = new Productionnull_3929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}