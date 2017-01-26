package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_393 {
    private final Production99_393 production = new Production99_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}