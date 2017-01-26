package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_379 {
    private final Production70_379 production = new Production70_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}