package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_258 {
    private final Production70_258 production = new Production70_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}