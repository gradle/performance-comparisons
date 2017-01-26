package org.gradle.test.performancenull_356;

import static org.junit.Assert.*;

public class Testnull_35578 {
    private final Productionnull_35578 production = new Productionnull_35578("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}