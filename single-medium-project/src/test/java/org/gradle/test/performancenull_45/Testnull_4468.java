package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4468 {
    private final Productionnull_4468 production = new Productionnull_4468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}