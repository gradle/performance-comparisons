package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_145 {
    private final Production70_145 production = new Production70_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}