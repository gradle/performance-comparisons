package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_263 {
    private final Production13_263 production = new Production13_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}