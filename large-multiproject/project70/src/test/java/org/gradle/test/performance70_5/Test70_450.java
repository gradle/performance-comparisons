package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_450 {
    private final Production70_450 production = new Production70_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}