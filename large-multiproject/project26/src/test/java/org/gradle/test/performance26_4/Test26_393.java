package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_393 {
    private final Production26_393 production = new Production26_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}