package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_311 {
    private final Production70_311 production = new Production70_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}