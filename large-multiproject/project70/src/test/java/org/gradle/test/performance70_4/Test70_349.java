package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_349 {
    private final Production70_349 production = new Production70_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}