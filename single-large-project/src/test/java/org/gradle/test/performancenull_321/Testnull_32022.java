package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32022 {
    private final Productionnull_32022 production = new Productionnull_32022("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}