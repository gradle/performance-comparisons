package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_309 {
    private final Production70_309 production = new Production70_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}