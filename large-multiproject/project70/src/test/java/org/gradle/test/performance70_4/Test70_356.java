package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_356 {
    private final Production70_356 production = new Production70_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}