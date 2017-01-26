package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_440 {
    private final Production70_440 production = new Production70_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}