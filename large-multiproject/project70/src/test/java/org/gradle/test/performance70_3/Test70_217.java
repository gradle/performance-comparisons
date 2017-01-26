package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_217 {
    private final Production70_217 production = new Production70_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}