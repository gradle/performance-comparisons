package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30621 {
    private final Productionnull_30621 production = new Productionnull_30621("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}