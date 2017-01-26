package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_274 {
    private final Production70_274 production = new Production70_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}