package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_305 {
    private final Production70_305 production = new Production70_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}