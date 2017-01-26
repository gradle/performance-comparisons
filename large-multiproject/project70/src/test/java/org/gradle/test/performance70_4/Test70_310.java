package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_310 {
    private final Production70_310 production = new Production70_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}