package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30686 {
    private final Productionnull_30686 production = new Productionnull_30686("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}