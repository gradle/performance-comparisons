package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_252 {
    private final Production70_252 production = new Production70_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}