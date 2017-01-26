package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_415 {
    private final Production70_415 production = new Production70_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}