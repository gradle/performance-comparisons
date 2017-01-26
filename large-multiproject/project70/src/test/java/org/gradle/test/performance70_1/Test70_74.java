package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_74 {
    private final Production70_74 production = new Production70_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}