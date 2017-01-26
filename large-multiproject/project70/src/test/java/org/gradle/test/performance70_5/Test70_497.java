package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_497 {
    private final Production70_497 production = new Production70_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}