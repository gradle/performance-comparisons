package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_370 {
    private final Production70_370 production = new Production70_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}