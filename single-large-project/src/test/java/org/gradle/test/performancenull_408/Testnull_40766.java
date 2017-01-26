package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40766 {
    private final Productionnull_40766 production = new Productionnull_40766("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}