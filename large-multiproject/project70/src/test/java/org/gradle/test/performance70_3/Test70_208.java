package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_208 {
    private final Production70_208 production = new Production70_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}