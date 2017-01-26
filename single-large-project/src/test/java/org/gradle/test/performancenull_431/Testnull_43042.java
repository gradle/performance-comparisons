package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43042 {
    private final Productionnull_43042 production = new Productionnull_43042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}