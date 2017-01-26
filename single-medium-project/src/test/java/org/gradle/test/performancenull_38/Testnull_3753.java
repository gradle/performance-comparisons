package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3753 {
    private final Productionnull_3753 production = new Productionnull_3753("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}