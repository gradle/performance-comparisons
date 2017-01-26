package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_70 {
    private final Production70_70 production = new Production70_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}