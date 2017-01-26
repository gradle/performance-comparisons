package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_165 {
    private final Production70_165 production = new Production70_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}