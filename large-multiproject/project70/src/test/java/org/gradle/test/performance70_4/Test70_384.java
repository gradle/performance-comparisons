package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_384 {
    private final Production70_384 production = new Production70_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}