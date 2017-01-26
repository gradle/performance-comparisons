package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42426 {
    private final Productionnull_42426 production = new Productionnull_42426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}