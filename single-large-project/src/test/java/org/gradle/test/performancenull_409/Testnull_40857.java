package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40857 {
    private final Productionnull_40857 production = new Productionnull_40857("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}