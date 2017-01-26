package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42465 {
    private final Productionnull_42465 production = new Productionnull_42465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}