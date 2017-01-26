package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_115 {
    private final Production70_115 production = new Production70_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}