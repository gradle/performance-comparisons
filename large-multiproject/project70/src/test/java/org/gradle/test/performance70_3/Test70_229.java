package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_229 {
    private final Production70_229 production = new Production70_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}