package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25882 {
    private final Productionnull_25882 production = new Productionnull_25882("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}