package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_285 {
    private final Production70_285 production = new Production70_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}