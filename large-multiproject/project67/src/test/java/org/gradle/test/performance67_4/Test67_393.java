package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_393 {
    private final Production67_393 production = new Production67_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}