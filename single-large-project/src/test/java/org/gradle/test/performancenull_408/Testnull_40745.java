package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40745 {
    private final Productionnull_40745 production = new Productionnull_40745("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}