package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_462 {
    private final Production70_462 production = new Production70_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}