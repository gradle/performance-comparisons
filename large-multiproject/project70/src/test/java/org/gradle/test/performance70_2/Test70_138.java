package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_138 {
    private final Production70_138 production = new Production70_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}