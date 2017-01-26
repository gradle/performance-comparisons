package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_393 {
    private final Production84_393 production = new Production84_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}