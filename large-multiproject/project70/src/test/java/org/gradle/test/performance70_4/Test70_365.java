package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_365 {
    private final Production70_365 production = new Production70_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}