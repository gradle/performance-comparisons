package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_25 {
    private final Production70_25 production = new Production70_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}