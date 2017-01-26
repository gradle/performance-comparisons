package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_206 {
    private final Production70_206 production = new Production70_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}