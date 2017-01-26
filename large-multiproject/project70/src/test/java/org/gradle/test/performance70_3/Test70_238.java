package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_238 {
    private final Production70_238 production = new Production70_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}