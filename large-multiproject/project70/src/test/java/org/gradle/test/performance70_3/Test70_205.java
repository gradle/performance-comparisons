package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_205 {
    private final Production70_205 production = new Production70_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}