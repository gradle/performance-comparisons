package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_134 {
    private final Production70_134 production = new Production70_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}