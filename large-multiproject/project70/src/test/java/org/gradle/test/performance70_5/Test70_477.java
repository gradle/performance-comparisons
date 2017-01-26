package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_477 {
    private final Production70_477 production = new Production70_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}