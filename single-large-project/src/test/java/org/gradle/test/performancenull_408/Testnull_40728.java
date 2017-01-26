package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40728 {
    private final Productionnull_40728 production = new Productionnull_40728("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}