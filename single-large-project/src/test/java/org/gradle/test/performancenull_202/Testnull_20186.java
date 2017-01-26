package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20186 {
    private final Productionnull_20186 production = new Productionnull_20186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}