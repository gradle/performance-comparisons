package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_474 {
    private final Production70_474 production = new Production70_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}