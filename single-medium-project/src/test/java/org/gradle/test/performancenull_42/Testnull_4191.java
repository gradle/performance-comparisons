package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4191 {
    private final Productionnull_4191 production = new Productionnull_4191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}