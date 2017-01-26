package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_407 {
    private final Production70_407 production = new Production70_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}