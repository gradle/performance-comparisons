package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_117 {
    private final Production90_117 production = new Production90_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}