package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_35 {
    private final Production70_35 production = new Production70_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}