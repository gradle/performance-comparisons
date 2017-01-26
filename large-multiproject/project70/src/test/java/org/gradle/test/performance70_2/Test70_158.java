package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_158 {
    private final Production70_158 production = new Production70_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}