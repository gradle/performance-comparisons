package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_198 {
    private final Production70_198 production = new Production70_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}