package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_393 {
    private final Production27_393 production = new Production27_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}