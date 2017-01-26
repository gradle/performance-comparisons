package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_394 {
    private final Production70_394 production = new Production70_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}