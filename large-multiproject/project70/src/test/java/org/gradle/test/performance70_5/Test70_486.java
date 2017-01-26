package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_486 {
    private final Production70_486 production = new Production70_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}