package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_192 {
    private final Production70_192 production = new Production70_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}