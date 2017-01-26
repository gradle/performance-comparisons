package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4723 {
    private final Productionnull_4723 production = new Productionnull_4723("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}