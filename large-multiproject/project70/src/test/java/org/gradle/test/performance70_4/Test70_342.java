package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_342 {
    private final Production70_342 production = new Production70_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}