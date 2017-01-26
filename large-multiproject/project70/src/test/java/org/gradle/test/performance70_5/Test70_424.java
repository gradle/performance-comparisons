package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_424 {
    private final Production70_424 production = new Production70_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}