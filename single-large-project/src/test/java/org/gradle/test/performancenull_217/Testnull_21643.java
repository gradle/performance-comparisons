package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21643 {
    private final Productionnull_21643 production = new Productionnull_21643("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}