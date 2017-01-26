package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_435 {
    private final Production70_435 production = new Production70_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}