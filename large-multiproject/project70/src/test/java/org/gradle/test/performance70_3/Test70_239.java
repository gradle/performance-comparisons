package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_239 {
    private final Production70_239 production = new Production70_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}