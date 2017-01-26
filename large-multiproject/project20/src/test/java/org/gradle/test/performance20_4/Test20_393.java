package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_393 {
    private final Production20_393 production = new Production20_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}