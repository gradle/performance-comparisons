package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3953 {
    private final Productionnull_3953 production = new Productionnull_3953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}