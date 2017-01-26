package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_302 {
    private final Production70_302 production = new Production70_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}