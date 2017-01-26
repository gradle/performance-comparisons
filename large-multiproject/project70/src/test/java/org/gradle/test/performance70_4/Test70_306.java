package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_306 {
    private final Production70_306 production = new Production70_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}