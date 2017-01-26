package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_458 {
    private final Production70_458 production = new Production70_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}