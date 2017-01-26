package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_393 {
    private final Production58_393 production = new Production58_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}