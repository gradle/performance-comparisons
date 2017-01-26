package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_63 {
    private final Production70_63 production = new Production70_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}