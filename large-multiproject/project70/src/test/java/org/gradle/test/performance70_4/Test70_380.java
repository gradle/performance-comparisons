package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_380 {
    private final Production70_380 production = new Production70_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}