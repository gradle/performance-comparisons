package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3931 {
    private final Productionnull_3931 production = new Productionnull_3931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}