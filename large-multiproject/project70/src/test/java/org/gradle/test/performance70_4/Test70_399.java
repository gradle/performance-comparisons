package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_399 {
    private final Production70_399 production = new Production70_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}