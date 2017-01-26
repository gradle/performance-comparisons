package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_213 {
    private final Production70_213 production = new Production70_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}