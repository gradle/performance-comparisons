package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_177 {
    private final Production70_177 production = new Production70_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}