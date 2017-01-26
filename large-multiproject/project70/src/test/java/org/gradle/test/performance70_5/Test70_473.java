package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_473 {
    private final Production70_473 production = new Production70_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}