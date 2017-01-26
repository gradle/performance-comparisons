package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_393 {
    private final Production79_393 production = new Production79_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}