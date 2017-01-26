package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39942 {
    private final Productionnull_39942 production = new Productionnull_39942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}