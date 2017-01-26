package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4919 {
    private final Productionnull_4919 production = new Productionnull_4919("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}