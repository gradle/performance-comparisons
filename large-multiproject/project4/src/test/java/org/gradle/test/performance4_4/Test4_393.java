package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_393 {
    private final Production4_393 production = new Production4_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}