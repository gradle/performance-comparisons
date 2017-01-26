package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_317 {
    private final Production70_317 production = new Production70_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}