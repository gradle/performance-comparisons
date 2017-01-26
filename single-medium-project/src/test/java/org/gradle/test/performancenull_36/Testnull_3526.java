package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3526 {
    private final Productionnull_3526 production = new Productionnull_3526("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}