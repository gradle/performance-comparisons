package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49300 {
    private final Productionnull_49300 production = new Productionnull_49300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}