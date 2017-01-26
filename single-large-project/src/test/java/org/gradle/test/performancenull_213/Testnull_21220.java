package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21220 {
    private final Productionnull_21220 production = new Productionnull_21220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}