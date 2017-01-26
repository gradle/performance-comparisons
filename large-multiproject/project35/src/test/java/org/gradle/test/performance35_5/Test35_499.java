package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_499 {
    private final Production35_499 production = new Production35_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}