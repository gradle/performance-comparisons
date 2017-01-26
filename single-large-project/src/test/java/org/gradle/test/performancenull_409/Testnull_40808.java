package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40808 {
    private final Productionnull_40808 production = new Productionnull_40808("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}