package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_393 {
    private final Production38_393 production = new Production38_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}