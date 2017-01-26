package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_226 {
    private final Production70_226 production = new Production70_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}