package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_262 {
    private final Production90_262 production = new Production90_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}