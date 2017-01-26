package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_64 {
    private final Production70_64 production = new Production70_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}