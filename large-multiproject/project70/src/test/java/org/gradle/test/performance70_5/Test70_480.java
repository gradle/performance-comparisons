package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_480 {
    private final Production70_480 production = new Production70_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}