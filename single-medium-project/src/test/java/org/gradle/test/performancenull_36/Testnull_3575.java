package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3575 {
    private final Productionnull_3575 production = new Productionnull_3575("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}