package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10172 {
    private final Productionnull_10172 production = new Productionnull_10172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}