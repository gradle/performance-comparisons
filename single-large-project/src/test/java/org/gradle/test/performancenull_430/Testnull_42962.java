package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42962 {
    private final Productionnull_42962 production = new Productionnull_42962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}