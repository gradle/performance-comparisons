package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38526 {
    private final Productionnull_38526 production = new Productionnull_38526("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}