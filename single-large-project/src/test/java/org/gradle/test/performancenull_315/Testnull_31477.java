package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31477 {
    private final Productionnull_31477 production = new Productionnull_31477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}