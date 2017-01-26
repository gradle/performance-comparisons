package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_393 {
    private final Production46_393 production = new Production46_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}