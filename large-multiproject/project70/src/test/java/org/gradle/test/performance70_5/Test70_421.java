package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_421 {
    private final Production70_421 production = new Production70_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}