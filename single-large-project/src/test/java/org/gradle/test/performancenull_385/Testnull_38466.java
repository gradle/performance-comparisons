package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38466 {
    private final Productionnull_38466 production = new Productionnull_38466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}