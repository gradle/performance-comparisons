package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_44 {
    private final Production70_44 production = new Production70_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}