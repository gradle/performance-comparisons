package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38575 {
    private final Productionnull_38575 production = new Productionnull_38575("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}