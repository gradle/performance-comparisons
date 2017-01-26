package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40715 {
    private final Productionnull_40715 production = new Productionnull_40715("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}