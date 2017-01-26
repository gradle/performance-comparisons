package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_352 {
    private final Production70_352 production = new Production70_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}