package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_312 {
    private final Production70_312 production = new Production70_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}