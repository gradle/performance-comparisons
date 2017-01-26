package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21498 {
    private final Productionnull_21498 production = new Productionnull_21498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}