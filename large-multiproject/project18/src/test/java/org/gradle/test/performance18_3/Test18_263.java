package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_263 {
    private final Production18_263 production = new Production18_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}