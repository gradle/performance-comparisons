package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_263 {
    private final Production40_263 production = new Production40_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}