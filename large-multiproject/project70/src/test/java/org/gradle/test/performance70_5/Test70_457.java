package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_457 {
    private final Production70_457 production = new Production70_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}