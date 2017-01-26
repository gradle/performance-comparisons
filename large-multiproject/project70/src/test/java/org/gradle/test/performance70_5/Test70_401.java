package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_401 {
    private final Production70_401 production = new Production70_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}