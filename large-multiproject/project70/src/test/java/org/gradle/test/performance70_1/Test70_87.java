package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_87 {
    private final Production70_87 production = new Production70_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}