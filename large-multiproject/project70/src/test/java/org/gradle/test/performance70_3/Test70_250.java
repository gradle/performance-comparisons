package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_250 {
    private final Production70_250 production = new Production70_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}