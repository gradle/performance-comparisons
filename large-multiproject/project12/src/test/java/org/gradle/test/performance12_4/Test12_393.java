package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_393 {
    private final Production12_393 production = new Production12_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}