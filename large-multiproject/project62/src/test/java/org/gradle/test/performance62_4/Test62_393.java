package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_393 {
    private final Production62_393 production = new Production62_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}