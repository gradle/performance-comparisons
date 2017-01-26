package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_220 {
    private final Production70_220 production = new Production70_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}