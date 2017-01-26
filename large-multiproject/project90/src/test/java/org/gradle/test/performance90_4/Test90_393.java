package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_393 {
    private final Production90_393 production = new Production90_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}