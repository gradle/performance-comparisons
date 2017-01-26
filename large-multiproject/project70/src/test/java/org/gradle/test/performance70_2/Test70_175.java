package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_175 {
    private final Production70_175 production = new Production70_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}