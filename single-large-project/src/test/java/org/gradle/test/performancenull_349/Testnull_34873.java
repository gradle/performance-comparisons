package org.gradle.test.performancenull_349;

import static org.junit.Assert.*;

public class Testnull_34873 {
    private final Productionnull_34873 production = new Productionnull_34873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}