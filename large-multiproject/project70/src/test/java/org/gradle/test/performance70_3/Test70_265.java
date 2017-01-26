package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_265 {
    private final Production70_265 production = new Production70_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}