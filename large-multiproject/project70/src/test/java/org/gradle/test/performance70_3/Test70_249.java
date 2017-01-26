package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_249 {
    private final Production70_249 production = new Production70_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}