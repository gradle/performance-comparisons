package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_485 {
    private final Production70_485 production = new Production70_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}