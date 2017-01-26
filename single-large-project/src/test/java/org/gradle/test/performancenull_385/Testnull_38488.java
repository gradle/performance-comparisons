package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38488 {
    private final Productionnull_38488 production = new Productionnull_38488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}