package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3743 {
    private final Productionnull_3743 production = new Productionnull_3743("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}