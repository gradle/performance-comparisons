package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_490 {
    private final Production30_490 production = new Production30_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}