package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_393 {
    private final Production98_393 production = new Production98_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}