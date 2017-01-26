package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3781 {
    private final Productionnull_3781 production = new Productionnull_3781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}