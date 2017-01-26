package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25526 {
    private final Productionnull_25526 production = new Productionnull_25526("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}