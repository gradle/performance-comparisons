package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_190 {
    private final Production70_190 production = new Production70_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}