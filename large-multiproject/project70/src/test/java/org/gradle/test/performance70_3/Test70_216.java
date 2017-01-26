package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_216 {
    private final Production70_216 production = new Production70_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}