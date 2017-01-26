package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_139 {
    private final Production70_139 production = new Production70_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}