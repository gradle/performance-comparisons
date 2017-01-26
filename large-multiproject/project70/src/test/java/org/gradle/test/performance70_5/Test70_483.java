package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_483 {
    private final Production70_483 production = new Production70_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}