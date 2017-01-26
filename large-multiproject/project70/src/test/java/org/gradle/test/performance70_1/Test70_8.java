package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_8 {
    private final Production70_8 production = new Production70_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}