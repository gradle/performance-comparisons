package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49962 {
    private final Productionnull_49962 production = new Productionnull_49962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}