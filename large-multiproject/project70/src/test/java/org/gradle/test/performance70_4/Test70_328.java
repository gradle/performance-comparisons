package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_328 {
    private final Production70_328 production = new Production70_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}