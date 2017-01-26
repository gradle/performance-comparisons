package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_31 {
    private final Production70_31 production = new Production70_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}