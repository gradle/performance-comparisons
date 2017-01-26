package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_5 {
    private final Production70_5 production = new Production70_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}