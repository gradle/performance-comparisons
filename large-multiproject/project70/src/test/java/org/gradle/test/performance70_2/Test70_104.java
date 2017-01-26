package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_104 {
    private final Production70_104 production = new Production70_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}