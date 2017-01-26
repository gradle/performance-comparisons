package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_99 {
    private final Production70_99 production = new Production70_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}