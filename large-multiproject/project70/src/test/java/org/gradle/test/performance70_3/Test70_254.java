package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_254 {
    private final Production70_254 production = new Production70_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}