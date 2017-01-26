package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_204 {
    private final Production70_204 production = new Production70_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}