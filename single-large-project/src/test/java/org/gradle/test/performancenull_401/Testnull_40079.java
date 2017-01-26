package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40079 {
    private final Productionnull_40079 production = new Productionnull_40079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}