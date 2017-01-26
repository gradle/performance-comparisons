package org.gradle.test.performancenull_98;

import static org.junit.Assert.*;

public class Testnull_9709 {
    private final Productionnull_9709 production = new Productionnull_9709("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}