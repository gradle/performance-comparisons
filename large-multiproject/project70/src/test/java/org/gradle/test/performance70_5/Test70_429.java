package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_429 {
    private final Production70_429 production = new Production70_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}