package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_244 {
    private final Production70_244 production = new Production70_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}