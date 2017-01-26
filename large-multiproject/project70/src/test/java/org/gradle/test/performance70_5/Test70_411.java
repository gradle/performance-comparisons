package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_411 {
    private final Production70_411 production = new Production70_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}