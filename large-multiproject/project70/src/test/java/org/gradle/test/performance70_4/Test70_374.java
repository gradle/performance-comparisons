package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_374 {
    private final Production70_374 production = new Production70_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}