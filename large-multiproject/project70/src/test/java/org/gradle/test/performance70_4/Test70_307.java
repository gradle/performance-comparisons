package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_307 {
    private final Production70_307 production = new Production70_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}