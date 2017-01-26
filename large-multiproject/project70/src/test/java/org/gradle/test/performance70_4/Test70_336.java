package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_336 {
    private final Production70_336 production = new Production70_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}