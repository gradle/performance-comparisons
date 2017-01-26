package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_372 {
    private final Production70_372 production = new Production70_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}