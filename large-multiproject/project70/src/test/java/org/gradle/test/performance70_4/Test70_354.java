package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_354 {
    private final Production70_354 production = new Production70_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}