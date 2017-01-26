package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_180 {
    private final Production70_180 production = new Production70_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}