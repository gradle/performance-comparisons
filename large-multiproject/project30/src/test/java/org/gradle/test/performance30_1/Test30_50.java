package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_50 {
    private final Production30_50 production = new Production30_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}