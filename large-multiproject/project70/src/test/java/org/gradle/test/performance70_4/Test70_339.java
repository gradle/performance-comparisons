package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_339 {
    private final Production70_339 production = new Production70_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}