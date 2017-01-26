package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_164 {
    private final Production70_164 production = new Production70_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}