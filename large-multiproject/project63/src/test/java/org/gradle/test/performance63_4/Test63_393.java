package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_393 {
    private final Production63_393 production = new Production63_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}