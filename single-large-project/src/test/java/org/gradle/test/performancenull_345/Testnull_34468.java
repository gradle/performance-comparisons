package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34468 {
    private final Productionnull_34468 production = new Productionnull_34468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}