package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40778 {
    private final Productionnull_40778 production = new Productionnull_40778("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}