package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_256 {
    private final Production70_256 production = new Production70_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}