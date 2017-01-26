package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_230 {
    private final Production70_230 production = new Production70_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}