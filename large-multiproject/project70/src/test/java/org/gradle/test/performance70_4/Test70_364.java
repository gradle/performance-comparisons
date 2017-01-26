package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_364 {
    private final Production70_364 production = new Production70_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}