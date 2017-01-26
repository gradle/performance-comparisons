package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10087 {
    private final Productionnull_10087 production = new Productionnull_10087("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}