package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_13 {
    private final Production70_13 production = new Production70_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}