package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_149 {
    private final Production70_149 production = new Production70_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}