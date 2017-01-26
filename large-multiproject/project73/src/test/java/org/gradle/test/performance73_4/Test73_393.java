package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_393 {
    private final Production73_393 production = new Production73_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}