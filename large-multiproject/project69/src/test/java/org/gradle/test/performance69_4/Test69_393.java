package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_393 {
    private final Production69_393 production = new Production69_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}