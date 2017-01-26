package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_471 {
    private final Production70_471 production = new Production70_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}