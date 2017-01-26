package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42196 {
    private final Productionnull_42196 production = new Productionnull_42196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}