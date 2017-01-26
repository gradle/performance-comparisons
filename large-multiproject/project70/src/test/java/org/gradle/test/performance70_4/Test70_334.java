package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_334 {
    private final Production70_334 production = new Production70_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}