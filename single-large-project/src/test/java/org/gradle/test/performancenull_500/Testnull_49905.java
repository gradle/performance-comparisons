package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49905 {
    private final Productionnull_49905 production = new Productionnull_49905("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}