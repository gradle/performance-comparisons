package org.gradle.test.performancenull_304;

import static org.junit.Assert.*;

public class Testnull_30368 {
    private final Productionnull_30368 production = new Productionnull_30368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}