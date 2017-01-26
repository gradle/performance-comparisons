package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_318 {
    private final Production70_318 production = new Production70_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}