package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_263 {
    private final Production4_263 production = new Production4_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}