package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_155 {
    private final Production70_155 production = new Production70_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}