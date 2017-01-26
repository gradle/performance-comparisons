package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_69 {
    private final Production70_69 production = new Production70_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}