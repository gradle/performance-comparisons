package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_263 {
    private final Production70_263 production = new Production70_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}