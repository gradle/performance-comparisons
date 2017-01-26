package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_468 {
    private final Production70_468 production = new Production70_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}