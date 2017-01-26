package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_127 {
    private final Production70_127 production = new Production70_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}