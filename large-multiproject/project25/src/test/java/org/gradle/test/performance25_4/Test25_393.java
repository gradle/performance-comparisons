package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_393 {
    private final Production25_393 production = new Production25_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}