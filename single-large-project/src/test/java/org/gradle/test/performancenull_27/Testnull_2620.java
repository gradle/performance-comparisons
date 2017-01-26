package org.gradle.test.performancenull_27;

import static org.junit.Assert.*;

public class Testnull_2620 {
    private final Productionnull_2620 production = new Productionnull_2620("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}