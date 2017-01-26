package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_414 {
    private final Production92_414 production = new Production92_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}