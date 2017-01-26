package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_18 {
    private final Production70_18 production = new Production70_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}