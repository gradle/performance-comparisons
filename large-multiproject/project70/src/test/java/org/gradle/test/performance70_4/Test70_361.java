package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_361 {
    private final Production70_361 production = new Production70_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}