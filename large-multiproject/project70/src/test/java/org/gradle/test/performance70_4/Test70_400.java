package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_400 {
    private final Production70_400 production = new Production70_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}