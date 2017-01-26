package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_393 {
    private final Production54_393 production = new Production54_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}