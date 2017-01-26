package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40255 {
    private final Productionnull_40255 production = new Productionnull_40255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}