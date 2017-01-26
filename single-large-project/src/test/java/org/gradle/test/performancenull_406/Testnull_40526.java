package org.gradle.test.performancenull_406;

import static org.junit.Assert.*;

public class Testnull_40526 {
    private final Productionnull_40526 production = new Productionnull_40526("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}