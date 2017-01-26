package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1775 {
    private final Productionnull_1775 production = new Productionnull_1775("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}