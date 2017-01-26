package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21330 {
    private final Productionnull_21330 production = new Productionnull_21330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}