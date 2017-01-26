package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_393 {
    private final Production71_393 production = new Production71_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}