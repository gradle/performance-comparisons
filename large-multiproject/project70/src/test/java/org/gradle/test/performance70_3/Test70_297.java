package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_297 {
    private final Production70_297 production = new Production70_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}