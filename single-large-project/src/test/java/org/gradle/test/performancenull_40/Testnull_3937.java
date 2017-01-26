package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3937 {
    private final Productionnull_3937 production = new Productionnull_3937("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}