package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3968 {
    private final Productionnull_3968 production = new Productionnull_3968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}