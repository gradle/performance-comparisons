package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_176 {
    private final Production70_176 production = new Production70_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}