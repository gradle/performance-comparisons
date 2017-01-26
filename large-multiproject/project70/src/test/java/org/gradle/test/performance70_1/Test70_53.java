package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_53 {
    private final Production70_53 production = new Production70_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}