package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40217 {
    private final Productionnull_40217 production = new Productionnull_40217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}