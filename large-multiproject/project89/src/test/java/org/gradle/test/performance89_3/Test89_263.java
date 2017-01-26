package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_263 {
    private final Production89_263 production = new Production89_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}