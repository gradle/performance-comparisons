package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_277 {
    private final Production90_277 production = new Production90_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}