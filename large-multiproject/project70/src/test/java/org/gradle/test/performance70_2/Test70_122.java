package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_122 {
    private final Production70_122 production = new Production70_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}