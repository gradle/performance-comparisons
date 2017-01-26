package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_131 {
    private final Production70_131 production = new Production70_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}