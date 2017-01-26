package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_446 {
    private final Production70_446 production = new Production70_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}