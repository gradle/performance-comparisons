package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_194 {
    private final Production30_194 production = new Production30_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}