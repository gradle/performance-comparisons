package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28087 {
    private final Productionnull_28087 production = new Productionnull_28087("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}