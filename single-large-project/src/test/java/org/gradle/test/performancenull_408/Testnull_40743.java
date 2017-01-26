package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40743 {
    private final Productionnull_40743 production = new Productionnull_40743("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}