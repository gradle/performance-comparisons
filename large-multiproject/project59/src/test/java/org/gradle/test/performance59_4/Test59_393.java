package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_393 {
    private final Production59_393 production = new Production59_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}