package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_396 {
    private final Production70_396 production = new Production70_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}