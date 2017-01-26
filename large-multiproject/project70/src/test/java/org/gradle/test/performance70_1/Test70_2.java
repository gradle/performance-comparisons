package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_2 {
    private final Production70_2 production = new Production70_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}