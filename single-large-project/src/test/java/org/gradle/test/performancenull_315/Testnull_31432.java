package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31432 {
    private final Productionnull_31432 production = new Productionnull_31432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}