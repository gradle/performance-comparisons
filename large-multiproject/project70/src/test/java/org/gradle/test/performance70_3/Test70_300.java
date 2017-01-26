package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_300 {
    private final Production70_300 production = new Production70_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}