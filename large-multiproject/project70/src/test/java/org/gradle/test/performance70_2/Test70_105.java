package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_105 {
    private final Production70_105 production = new Production70_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}