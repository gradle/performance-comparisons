package org.gradle.test.performancenull_412;

import static org.junit.Assert.*;

public class Testnull_41130 {
    private final Productionnull_41130 production = new Productionnull_41130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}