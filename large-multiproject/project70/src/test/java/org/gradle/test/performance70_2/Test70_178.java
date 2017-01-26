package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_178 {
    private final Production70_178 production = new Production70_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}