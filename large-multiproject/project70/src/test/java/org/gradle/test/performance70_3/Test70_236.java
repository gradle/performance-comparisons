package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_236 {
    private final Production70_236 production = new Production70_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}