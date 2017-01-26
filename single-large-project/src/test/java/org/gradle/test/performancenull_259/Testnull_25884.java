package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25884 {
    private final Productionnull_25884 production = new Productionnull_25884("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}