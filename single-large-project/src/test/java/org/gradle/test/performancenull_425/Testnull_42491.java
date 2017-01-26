package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42491 {
    private final Productionnull_42491 production = new Productionnull_42491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}