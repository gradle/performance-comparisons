package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_107 {
    private final Production70_107 production = new Production70_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}