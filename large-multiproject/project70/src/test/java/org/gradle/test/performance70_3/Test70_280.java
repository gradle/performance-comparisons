package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_280 {
    private final Production70_280 production = new Production70_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}