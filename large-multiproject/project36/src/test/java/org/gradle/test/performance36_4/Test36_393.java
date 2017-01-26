package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_393 {
    private final Production36_393 production = new Production36_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}