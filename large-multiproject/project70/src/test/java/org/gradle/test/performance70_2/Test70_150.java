package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_150 {
    private final Production70_150 production = new Production70_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}