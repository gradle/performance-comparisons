package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49282 {
    private final Productionnull_49282 production = new Productionnull_49282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}