package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21165 {
    private final Productionnull_21165 production = new Productionnull_21165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}