package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_464 {
    private final Production70_464 production = new Production70_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}