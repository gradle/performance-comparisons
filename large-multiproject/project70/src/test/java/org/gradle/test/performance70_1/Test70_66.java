package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_66 {
    private final Production70_66 production = new Production70_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}