package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_484 {
    private final Production70_484 production = new Production70_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}