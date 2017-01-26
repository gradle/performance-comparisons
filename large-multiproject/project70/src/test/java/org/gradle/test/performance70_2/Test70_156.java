package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_156 {
    private final Production70_156 production = new Production70_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}