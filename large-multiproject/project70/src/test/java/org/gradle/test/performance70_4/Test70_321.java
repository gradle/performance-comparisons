package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_321 {
    private final Production70_321 production = new Production70_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}