package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_323 {
    private final Production70_323 production = new Production70_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}