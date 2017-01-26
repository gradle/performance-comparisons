package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_381 {
    private final Production70_381 production = new Production70_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}