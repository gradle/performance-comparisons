package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40771 {
    private final Productionnull_40771 production = new Productionnull_40771("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}