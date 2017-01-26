package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39961 {
    private final Productionnull_39961 production = new Productionnull_39961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}