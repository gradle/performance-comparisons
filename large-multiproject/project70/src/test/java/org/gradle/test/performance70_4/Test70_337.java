package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_337 {
    private final Production70_337 production = new Production70_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}