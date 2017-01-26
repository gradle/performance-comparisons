package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_277 {
    private final Production70_277 production = new Production70_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}