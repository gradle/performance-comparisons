package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_393 {
    private final Production56_393 production = new Production56_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}