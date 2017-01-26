package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_404 {
    private final Production70_404 production = new Production70_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}