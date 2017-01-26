package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_393 {
    private final Production80_393 production = new Production80_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}