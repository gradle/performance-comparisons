package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_55 {
    private final Production70_55 production = new Production70_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}