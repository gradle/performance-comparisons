package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_329 {
    private final Production70_329 production = new Production70_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}