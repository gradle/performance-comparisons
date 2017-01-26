package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_6 {
    private final Production70_6 production = new Production70_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}