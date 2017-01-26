package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_447 {
    private final Production70_447 production = new Production70_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}