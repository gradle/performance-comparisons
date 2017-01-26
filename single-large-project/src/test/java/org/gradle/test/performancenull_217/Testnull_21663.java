package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21663 {
    private final Productionnull_21663 production = new Productionnull_21663("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}