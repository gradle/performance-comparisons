package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34079 {
    private final Productionnull_34079 production = new Productionnull_34079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}