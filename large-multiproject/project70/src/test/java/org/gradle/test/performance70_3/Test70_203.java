package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_203 {
    private final Production70_203 production = new Production70_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}