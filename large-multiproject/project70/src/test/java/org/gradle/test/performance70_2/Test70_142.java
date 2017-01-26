package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_142 {
    private final Production70_142 production = new Production70_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}