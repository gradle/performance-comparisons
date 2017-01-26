package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_393 {
    private final Production43_393 production = new Production43_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}