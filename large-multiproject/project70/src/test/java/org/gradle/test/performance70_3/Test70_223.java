package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_223 {
    private final Production70_223 production = new Production70_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}