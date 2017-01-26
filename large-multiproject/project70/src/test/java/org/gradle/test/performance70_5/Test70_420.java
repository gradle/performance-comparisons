package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_420 {
    private final Production70_420 production = new Production70_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}