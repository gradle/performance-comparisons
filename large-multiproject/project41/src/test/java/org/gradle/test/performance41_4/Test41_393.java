package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_393 {
    private final Production41_393 production = new Production41_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}