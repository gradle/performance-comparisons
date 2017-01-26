package org.gradle.test.performancenull_348;

import static org.junit.Assert.*;

public class Testnull_34766 {
    private final Productionnull_34766 production = new Productionnull_34766("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}