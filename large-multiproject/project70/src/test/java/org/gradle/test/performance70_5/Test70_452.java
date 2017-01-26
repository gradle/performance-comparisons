package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_452 {
    private final Production70_452 production = new Production70_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}