package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_291 {
    private final Production70_291 production = new Production70_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}