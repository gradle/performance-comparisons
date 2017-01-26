package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_48 {
    private final Production70_48 production = new Production70_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}