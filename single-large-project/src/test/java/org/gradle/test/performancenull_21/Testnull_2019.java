package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2019 {
    private final Productionnull_2019 production = new Productionnull_2019("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}