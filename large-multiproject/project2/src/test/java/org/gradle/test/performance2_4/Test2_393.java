package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_393 {
    private final Production2_393 production = new Production2_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}