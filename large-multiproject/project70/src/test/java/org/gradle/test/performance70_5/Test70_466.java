package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_466 {
    private final Production70_466 production = new Production70_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}