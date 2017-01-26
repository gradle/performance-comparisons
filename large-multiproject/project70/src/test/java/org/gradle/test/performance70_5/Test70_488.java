package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_488 {
    private final Production70_488 production = new Production70_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}