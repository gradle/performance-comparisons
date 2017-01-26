package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3987 {
    private final Productionnull_3987 production = new Productionnull_3987("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}