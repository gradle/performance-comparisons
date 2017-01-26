package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42490 {
    private final Productionnull_42490 production = new Productionnull_42490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}