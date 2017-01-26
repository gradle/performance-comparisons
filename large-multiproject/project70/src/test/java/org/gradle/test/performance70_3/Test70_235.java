package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_235 {
    private final Production70_235 production = new Production70_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}