package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_114 {
    private final Production70_114 production = new Production70_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}