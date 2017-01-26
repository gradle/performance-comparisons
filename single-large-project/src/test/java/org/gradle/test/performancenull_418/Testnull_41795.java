package org.gradle.test.performancenull_418;

import static org.junit.Assert.*;

public class Testnull_41795 {
    private final Productionnull_41795 production = new Productionnull_41795("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}