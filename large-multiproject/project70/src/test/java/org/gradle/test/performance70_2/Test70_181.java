package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_181 {
    private final Production70_181 production = new Production70_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}