package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_393 {
    private final Production37_393 production = new Production37_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}