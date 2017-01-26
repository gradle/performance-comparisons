package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_324 {
    private final Production70_324 production = new Production70_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}