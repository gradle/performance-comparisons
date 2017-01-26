package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_441 {
    private final Production70_441 production = new Production70_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}