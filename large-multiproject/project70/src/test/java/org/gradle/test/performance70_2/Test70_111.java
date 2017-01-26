package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_111 {
    private final Production70_111 production = new Production70_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}