package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_377 {
    private final Production70_377 production = new Production70_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}