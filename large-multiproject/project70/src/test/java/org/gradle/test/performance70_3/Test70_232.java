package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_232 {
    private final Production70_232 production = new Production70_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}