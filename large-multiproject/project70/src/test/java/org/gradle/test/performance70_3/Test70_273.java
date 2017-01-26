package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_273 {
    private final Production70_273 production = new Production70_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}