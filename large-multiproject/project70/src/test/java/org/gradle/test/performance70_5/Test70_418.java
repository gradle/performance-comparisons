package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_418 {
    private final Production70_418 production = new Production70_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}