package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4779 {
    private final Productionnull_4779 production = new Productionnull_4779("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}