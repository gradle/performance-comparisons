package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_103 {
    private final Production70_103 production = new Production70_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}