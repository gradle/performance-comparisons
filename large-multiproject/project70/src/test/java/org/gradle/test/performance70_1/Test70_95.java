package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_95 {
    private final Production70_95 production = new Production70_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}