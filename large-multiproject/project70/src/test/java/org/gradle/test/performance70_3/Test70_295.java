package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_295 {
    private final Production70_295 production = new Production70_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}