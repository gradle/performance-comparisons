package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_30 {
    private final Production70_30 production = new Production70_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}