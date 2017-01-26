package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35905 {
    private final Productionnull_35905 production = new Productionnull_35905("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}