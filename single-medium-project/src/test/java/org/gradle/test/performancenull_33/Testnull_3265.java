package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3265 {
    private final Productionnull_3265 production = new Productionnull_3265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}