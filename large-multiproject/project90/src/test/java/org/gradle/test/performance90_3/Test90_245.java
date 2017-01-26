package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_245 {
    private final Production90_245 production = new Production90_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}