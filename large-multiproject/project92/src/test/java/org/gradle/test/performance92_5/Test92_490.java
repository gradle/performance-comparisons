package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_490 {
    private final Production92_490 production = new Production92_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}