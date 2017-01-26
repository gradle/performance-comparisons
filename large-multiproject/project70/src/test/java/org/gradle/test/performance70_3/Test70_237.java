package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_237 {
    private final Production70_237 production = new Production70_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}