package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_403 {
    private final Production70_403 production = new Production70_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}