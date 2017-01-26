package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_242 {
    private final Production70_242 production = new Production70_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}