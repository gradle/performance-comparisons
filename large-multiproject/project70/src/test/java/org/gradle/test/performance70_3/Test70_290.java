package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_290 {
    private final Production70_290 production = new Production70_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}