package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_186 {
    private final Production70_186 production = new Production70_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}