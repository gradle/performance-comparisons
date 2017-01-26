package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_15 {
    private final Production70_15 production = new Production70_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}