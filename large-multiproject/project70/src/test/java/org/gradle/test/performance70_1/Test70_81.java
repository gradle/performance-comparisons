package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_81 {
    private final Production70_81 production = new Production70_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}