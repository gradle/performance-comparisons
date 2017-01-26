package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_316 {
    private final Production70_316 production = new Production70_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}