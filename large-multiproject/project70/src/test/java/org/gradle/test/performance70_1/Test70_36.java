package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_36 {
    private final Production70_36 production = new Production70_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}