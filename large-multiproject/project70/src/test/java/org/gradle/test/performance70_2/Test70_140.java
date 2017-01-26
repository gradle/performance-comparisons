package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_140 {
    private final Production70_140 production = new Production70_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}