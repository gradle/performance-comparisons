package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_78 {
    private final Production70_78 production = new Production70_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}