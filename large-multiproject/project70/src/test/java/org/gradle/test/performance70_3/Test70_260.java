package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_260 {
    private final Production70_260 production = new Production70_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}