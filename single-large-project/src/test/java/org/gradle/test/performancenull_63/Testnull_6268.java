package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6268 {
    private final Productionnull_6268 production = new Productionnull_6268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}