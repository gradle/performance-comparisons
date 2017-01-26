package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18268 {
    private final Productionnull_18268 production = new Productionnull_18268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}