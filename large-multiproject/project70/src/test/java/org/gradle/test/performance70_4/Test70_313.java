package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_313 {
    private final Production70_313 production = new Production70_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}