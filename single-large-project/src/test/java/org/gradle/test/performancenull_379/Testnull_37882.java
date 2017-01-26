package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37882 {
    private final Productionnull_37882 production = new Productionnull_37882("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}