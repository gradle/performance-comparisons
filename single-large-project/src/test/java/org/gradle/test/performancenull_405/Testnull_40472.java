package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40472 {
    private final Productionnull_40472 production = new Productionnull_40472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}