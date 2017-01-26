package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2022 {
    private final Productionnull_2022 production = new Productionnull_2022("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}