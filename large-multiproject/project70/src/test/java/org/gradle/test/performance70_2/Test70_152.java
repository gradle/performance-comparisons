package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_152 {
    private final Production70_152 production = new Production70_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}