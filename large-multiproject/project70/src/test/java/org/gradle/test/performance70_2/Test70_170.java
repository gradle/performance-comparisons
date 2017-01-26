package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_170 {
    private final Production70_170 production = new Production70_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}