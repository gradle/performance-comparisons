package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42061 {
    private final Productionnull_42061 production = new Productionnull_42061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}