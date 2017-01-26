package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_187 {
    private final Production70_187 production = new Production70_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}