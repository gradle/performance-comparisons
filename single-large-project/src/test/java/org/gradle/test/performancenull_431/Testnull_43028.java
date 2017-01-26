package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43028 {
    private final Productionnull_43028 production = new Productionnull_43028("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}