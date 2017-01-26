package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_351 {
    private final Production70_351 production = new Production70_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}