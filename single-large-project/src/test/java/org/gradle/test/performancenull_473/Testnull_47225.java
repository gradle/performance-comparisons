package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47225 {
    private final Productionnull_47225 production = new Productionnull_47225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}