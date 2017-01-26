package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30700 {
    private final Productionnull_30700 production = new Productionnull_30700("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}