package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34281 {
    private final Productionnull_34281 production = new Productionnull_34281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}