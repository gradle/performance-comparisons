package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_79 {
    private final Production70_79 production = new Production70_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}