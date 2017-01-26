package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_343 {
    private final Production70_343 production = new Production70_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}