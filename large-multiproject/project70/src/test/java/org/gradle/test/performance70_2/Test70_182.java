package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_182 {
    private final Production70_182 production = new Production70_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}