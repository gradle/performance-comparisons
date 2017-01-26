package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_373 {
    private final Production70_373 production = new Production70_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}