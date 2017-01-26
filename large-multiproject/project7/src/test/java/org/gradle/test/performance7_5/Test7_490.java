package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_490 {
    private final Production7_490 production = new Production7_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}