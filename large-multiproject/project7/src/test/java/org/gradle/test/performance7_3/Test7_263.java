package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_263 {
    private final Production7_263 production = new Production7_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}