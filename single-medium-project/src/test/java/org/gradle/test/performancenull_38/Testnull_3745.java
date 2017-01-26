package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3745 {
    private final Productionnull_3745 production = new Productionnull_3745("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}