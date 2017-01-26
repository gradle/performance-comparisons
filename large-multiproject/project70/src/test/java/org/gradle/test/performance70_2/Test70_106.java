package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_106 {
    private final Production70_106 production = new Production70_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}