package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30624 {
    private final Productionnull_30624 production = new Productionnull_30624("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}