package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30191 {
    private final Productionnull_30191 production = new Productionnull_30191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}