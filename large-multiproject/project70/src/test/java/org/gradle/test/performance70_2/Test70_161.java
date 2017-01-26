package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_161 {
    private final Production70_161 production = new Production70_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}