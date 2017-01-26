package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_151 {
    private final Production70_151 production = new Production70_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}