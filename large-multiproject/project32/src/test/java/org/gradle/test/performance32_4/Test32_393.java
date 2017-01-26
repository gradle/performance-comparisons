package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_393 {
    private final Production32_393 production = new Production32_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}