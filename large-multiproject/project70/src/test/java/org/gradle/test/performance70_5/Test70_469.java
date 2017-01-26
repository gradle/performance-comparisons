package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_469 {
    private final Production70_469 production = new Production70_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}