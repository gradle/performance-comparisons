package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41079 {
    private final Productionnull_41079 production = new Productionnull_41079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}