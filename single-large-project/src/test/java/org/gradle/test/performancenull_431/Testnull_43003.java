package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43003 {
    private final Productionnull_43003 production = new Productionnull_43003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}