package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_196 {
    private final Production70_196 production = new Production70_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}