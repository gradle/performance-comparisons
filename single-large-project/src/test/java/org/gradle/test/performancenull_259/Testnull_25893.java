package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25893 {
    private final Productionnull_25893 production = new Productionnull_25893("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}