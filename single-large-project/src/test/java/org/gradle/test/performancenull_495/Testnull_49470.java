package org.gradle.test.performancenull_495;

import static org.junit.Assert.*;

public class Testnull_49470 {
    private final Productionnull_49470 production = new Productionnull_49470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}