package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_308 {
    private final Production70_308 production = new Production70_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}