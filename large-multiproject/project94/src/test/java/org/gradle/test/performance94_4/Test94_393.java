package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_393 {
    private final Production94_393 production = new Production94_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}