package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3963 {
    private final Productionnull_3963 production = new Productionnull_3963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}