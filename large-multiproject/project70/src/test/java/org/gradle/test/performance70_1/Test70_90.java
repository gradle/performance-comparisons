package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_90 {
    private final Production70_90 production = new Production70_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}