package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_393 {
    private final Production91_393 production = new Production91_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}