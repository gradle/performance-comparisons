package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_34 {
    private final Production70_34 production = new Production70_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}