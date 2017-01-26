package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_47 {
    private final Production70_47 production = new Production70_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}