package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_476 {
    private final Production70_476 production = new Production70_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}