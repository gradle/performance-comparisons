package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_389 {
    private final Production70_389 production = new Production70_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}