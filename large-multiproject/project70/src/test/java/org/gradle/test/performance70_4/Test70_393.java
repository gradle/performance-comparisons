package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_393 {
    private final Production70_393 production = new Production70_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}