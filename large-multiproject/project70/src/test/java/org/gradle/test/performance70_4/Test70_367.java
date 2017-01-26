package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_367 {
    private final Production70_367 production = new Production70_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}