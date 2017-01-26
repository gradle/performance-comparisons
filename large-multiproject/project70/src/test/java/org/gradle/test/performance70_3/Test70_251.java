package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_251 {
    private final Production70_251 production = new Production70_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}