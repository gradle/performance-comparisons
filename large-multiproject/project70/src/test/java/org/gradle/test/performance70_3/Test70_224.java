package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_224 {
    private final Production70_224 production = new Production70_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}