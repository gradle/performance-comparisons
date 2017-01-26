package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_173 {
    private final Production70_173 production = new Production70_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}