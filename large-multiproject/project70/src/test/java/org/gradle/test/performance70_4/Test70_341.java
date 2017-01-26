package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_341 {
    private final Production70_341 production = new Production70_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}