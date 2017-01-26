package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18087 {
    private final Productionnull_18087 production = new Productionnull_18087("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}