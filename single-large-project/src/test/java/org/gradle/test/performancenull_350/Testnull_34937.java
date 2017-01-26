package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34937 {
    private final Productionnull_34937 production = new Productionnull_34937("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}