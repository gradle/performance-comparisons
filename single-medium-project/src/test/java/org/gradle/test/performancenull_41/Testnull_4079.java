package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4079 {
    private final Productionnull_4079 production = new Productionnull_4079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}