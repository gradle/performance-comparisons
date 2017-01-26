package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_17 {
    private final Production70_17 production = new Production70_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}