package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_268 {
    private final Production70_268 production = new Production70_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}