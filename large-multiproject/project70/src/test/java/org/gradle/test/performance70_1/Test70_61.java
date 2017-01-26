package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_61 {
    private final Production70_61 production = new Production70_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}