package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_426 {
    private final Production70_426 production = new Production70_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}