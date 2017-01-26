package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_174 {
    private final Production70_174 production = new Production70_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}