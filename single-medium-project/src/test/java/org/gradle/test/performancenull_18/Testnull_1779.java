package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1779 {
    private final Productionnull_1779 production = new Productionnull_1779("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}