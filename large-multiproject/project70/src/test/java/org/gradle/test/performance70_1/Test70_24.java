package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_24 {
    private final Production70_24 production = new Production70_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}