package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_393 {
    private final Production45_393 production = new Production45_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}