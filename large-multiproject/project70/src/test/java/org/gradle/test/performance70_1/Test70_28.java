package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_28 {
    private final Production70_28 production = new Production70_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}