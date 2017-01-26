package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_393 {
    private final Production22_393 production = new Production22_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}