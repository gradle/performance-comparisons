package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_455 {
    private final Production70_455 production = new Production70_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}