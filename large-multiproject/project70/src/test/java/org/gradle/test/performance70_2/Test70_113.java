package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_113 {
    private final Production70_113 production = new Production70_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}