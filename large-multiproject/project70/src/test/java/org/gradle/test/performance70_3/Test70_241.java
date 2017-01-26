package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_241 {
    private final Production70_241 production = new Production70_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}