package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_210 {
    private final Production70_210 production = new Production70_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}