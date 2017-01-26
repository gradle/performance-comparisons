package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_137 {
    private final Production70_137 production = new Production70_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}