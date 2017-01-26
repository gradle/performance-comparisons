package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_125 {
    private final Production70_125 production = new Production70_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}