package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_33 {
    private final Production70_33 production = new Production70_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}