package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_279 {
    private final Production70_279 production = new Production70_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}