package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_270 {
    private final Production70_270 production = new Production70_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}