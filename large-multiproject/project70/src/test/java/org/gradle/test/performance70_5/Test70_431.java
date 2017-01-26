package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_431 {
    private final Production70_431 production = new Production70_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}