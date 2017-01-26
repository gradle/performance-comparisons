package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_393 {
    private final Production15_393 production = new Production15_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}