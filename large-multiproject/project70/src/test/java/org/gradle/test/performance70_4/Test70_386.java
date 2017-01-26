package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_386 {
    private final Production70_386 production = new Production70_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}