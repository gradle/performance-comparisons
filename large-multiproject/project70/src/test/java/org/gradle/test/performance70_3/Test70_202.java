package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_202 {
    private final Production70_202 production = new Production70_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}