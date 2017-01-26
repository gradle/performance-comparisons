package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34998 {
    private final Productionnull_34998 production = new Productionnull_34998("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}