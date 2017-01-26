package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13061 {
    private final Productionnull_13061 production = new Productionnull_13061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}