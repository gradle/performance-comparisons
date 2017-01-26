package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_315 {
    private final Production70_315 production = new Production70_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}