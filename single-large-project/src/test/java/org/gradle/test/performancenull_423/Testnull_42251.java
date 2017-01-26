package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42251 {
    private final Productionnull_42251 production = new Productionnull_42251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}