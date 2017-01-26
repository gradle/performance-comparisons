package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_393 {
    private final Production28_393 production = new Production28_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}