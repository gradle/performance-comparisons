package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_340 {
    private final Production70_340 production = new Production70_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}