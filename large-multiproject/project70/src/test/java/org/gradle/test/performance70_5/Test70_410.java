package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_410 {
    private final Production70_410 production = new Production70_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}