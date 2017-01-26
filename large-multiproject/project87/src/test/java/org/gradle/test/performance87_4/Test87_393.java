package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_393 {
    private final Production87_393 production = new Production87_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}