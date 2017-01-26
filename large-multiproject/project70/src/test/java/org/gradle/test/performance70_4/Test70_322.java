package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_322 {
    private final Production70_322 production = new Production70_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}