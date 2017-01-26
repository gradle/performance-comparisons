package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_482 {
    private final Production70_482 production = new Production70_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}