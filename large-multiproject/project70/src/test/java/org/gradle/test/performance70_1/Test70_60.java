package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_60 {
    private final Production70_60 production = new Production70_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}